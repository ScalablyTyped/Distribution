package typings.std.global

import typings.std.BufferSource
import typings.std.WebAssembly.CompileError
import typings.std.WebAssembly.Global
import typings.std.WebAssembly.GlobalDescriptor
import typings.std.WebAssembly.Imports
import typings.std.WebAssembly.Instance
import typings.std.WebAssembly.LinkError
import typings.std.WebAssembly.Memory
import typings.std.WebAssembly.MemoryDescriptor
import typings.std.WebAssembly.Module
import typings.std.WebAssembly.ModuleExportDescriptor
import typings.std.WebAssembly.ModuleImportDescriptor
import typings.std.WebAssembly.RuntimeError
import typings.std.WebAssembly.Table
import typings.std.WebAssembly.TableDescriptor
import typings.std.WebAssembly.WebAssemblyInstantiatedSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  class CompileErrorCls () extends CompileError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  class GlobalCls protected () extends Global {
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  class InstanceCls protected () extends Instance {
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  class LinkErrorCls () extends LinkError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  class MemoryCls protected () extends Memory {
    def this(descriptor: MemoryDescriptor) = this()
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module.customSections")
    @js.native
    def customSections(moduleObject: typings.std.WebAssembly.Module, sectionName: java.lang.String): js.Array[typings.std.ArrayBuffer] = js.native
    
    @JSGlobal("WebAssembly.Module.exports")
    @js.native
    def exports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = js.native
    
    @JSGlobal("WebAssembly.Module.imports")
    @js.native
    def imports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  class ModuleCls protected () extends Module {
    def this(bytes: BufferSource) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  class RuntimeErrorCls () extends RuntimeError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  class TableCls protected () extends Table {
    def this(descriptor: TableDescriptor) = this()
  }
  
  @JSGlobal("WebAssembly.compile")
  @js.native
  def compile(bytes: BufferSource): js.Promise[Module] = js.native
  
  @JSGlobal("WebAssembly.compileStreaming")
  @js.native
  def compileStreaming(source: js.Promise[typings.std.Response]): js.Promise[Module] = js.native
  @JSGlobal("WebAssembly.compileStreaming")
  @js.native
  def compileStreaming(source: typings.std.Response): js.Promise[Module] = js.native
  
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(moduleObject: Module): js.Promise[Instance] = js.native
  @JSGlobal("WebAssembly.instantiate")
  @js.native
  def instantiate(moduleObject: Module, importObject: Imports): js.Promise[Instance] = js.native
  
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: js.Thenable[typings.std.Response]): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: js.Thenable[typings.std.Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: typings.std.Response): js.Promise[WebAssemblyInstantiatedSource] = js.native
  @JSGlobal("WebAssembly.instantiateStreaming")
  @js.native
  def instantiateStreaming(response: typings.std.Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = js.native
  
  @JSGlobal("WebAssembly.validate")
  @js.native
  def validate(bytes: BufferSource): scala.Boolean = js.native
}
