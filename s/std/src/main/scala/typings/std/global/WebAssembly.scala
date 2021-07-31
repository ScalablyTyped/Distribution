package typings.std.global

import typings.std.BufferSource
import typings.std.WebAssembly.CompileError
import typings.std.WebAssembly.Exports
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @JSGlobal("WebAssembly")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  class CompileErrorCls ()
    extends StObject
       with CompileError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  class GlobalCls protected ()
    extends StObject
       with Global {
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: js.Any) = this()
    
    /* CompleteClass */
    var value: js.Any = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  class InstanceCls protected ()
    extends StObject
       with Instance {
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
    
    /* CompleteClass */
    override val exports: Exports = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  class LinkErrorCls ()
    extends StObject
       with LinkError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  class MemoryCls protected ()
    extends StObject
       with Memory {
    def this(descriptor: MemoryDescriptor) = this()
    
    /* CompleteClass */
    override val buffer: typings.std.ArrayBuffer = js.native
    
    /* CompleteClass */
    override def grow(delta: Double): Double = js.native
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def customSections(moduleObject: typings.std.WebAssembly.Module, sectionName: java.lang.String): js.Array[typings.std.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("customSections")(moduleObject.asInstanceOf[js.Any], sectionName.asInstanceOf[js.Any])).asInstanceOf[js.Array[typings.std.ArrayBuffer]]
    
    @scala.inline
    def exports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleExportDescriptor]]
    
    @scala.inline
    def imports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleImportDescriptor]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  class ModuleCls protected ()
    extends StObject
       with Module {
    def this(bytes: BufferSource) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  class RuntimeErrorCls ()
    extends StObject
       with RuntimeError
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  class TableCls protected ()
    extends StObject
       with Table {
    def this(descriptor: TableDescriptor) = this()
  }
  
  @scala.inline
  def compile(bytes: BufferSource): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  @scala.inline
  def compileStreaming(source: js.Promise[typings.std.Response]): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  @scala.inline
  def compileStreaming(source: typings.std.Response): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  @scala.inline
  def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiate(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiate(moduleObject: Module): js.Promise[Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Instance]]
  @scala.inline
  def instantiate(moduleObject: Module, importObject: Imports): js.Promise[Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Instance]]
  
  @scala.inline
  def instantiateStreaming(response: js.Thenable[typings.std.Response]): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: js.Thenable[typings.std.Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: typings.std.Response): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  @scala.inline
  def instantiateStreaming(response: typings.std.Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(response.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  
  @scala.inline
  def validate(bytes: BufferSource): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
