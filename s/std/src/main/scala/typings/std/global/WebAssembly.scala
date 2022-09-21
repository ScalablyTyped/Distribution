package typings.std.global

import typings.std.BufferSource
import typings.std.WebAssembly.Exports
import typings.std.WebAssembly.Global
import typings.std.WebAssembly.GlobalDescriptor
import typings.std.WebAssembly.Imports
import typings.std.WebAssembly.Instance
import typings.std.WebAssembly.Memory
import typings.std.WebAssembly.MemoryDescriptor
import typings.std.WebAssembly.Module
import typings.std.WebAssembly.ModuleExportDescriptor
import typings.std.WebAssembly.ModuleImportDescriptor
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
  
  /* standard dom */
  inline def CompileError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("CompileError")().asInstanceOf[js.Error]
  inline def CompileError(message: java.lang.String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("CompileError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.CompileError")
  @js.native
  /* standard dom */
  open class CompileErrorCls ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Global")
  @js.native
  open class GlobalCls protected ()
    extends StObject
       with Global {
    /* standard dom */
    def this(descriptor: GlobalDescriptor) = this()
    def this(descriptor: GlobalDescriptor, v: Any) = this()
    
    /* standard dom */
    /* CompleteClass */
    var value: Any = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Instance")
  @js.native
  open class InstanceCls protected ()
    extends StObject
       with Instance {
    /* standard dom */
    def this(module: Module) = this()
    def this(module: Module, importObject: Imports) = this()
    
    /* standard dom */
    /* CompleteClass */
    override val exports: Exports = js.native
  }
  
  /* standard dom */
  inline def LinkError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkError")().asInstanceOf[js.Error]
  inline def LinkError(message: java.lang.String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("LinkError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.LinkError")
  @js.native
  /* standard dom */
  open class LinkErrorCls ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Memory")
  @js.native
  open class MemoryCls protected ()
    extends StObject
       with Memory {
    /* standard dom */
    def this(descriptor: MemoryDescriptor) = this()
    
    /* standard dom */
    /* CompleteClass */
    override val buffer: js.typedarray.ArrayBuffer = js.native
    
    /* standard dom */
    /* CompleteClass */
    override def grow(delta: Double): Double = js.native
  }
  
  object Module {
    
    @JSGlobal("WebAssembly.Module")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard dom */
    inline def customSections(moduleObject: typings.std.WebAssembly.Module, sectionName: java.lang.String): js.Array[js.typedarray.ArrayBuffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("customSections")(moduleObject.asInstanceOf[js.Any], sectionName.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.typedarray.ArrayBuffer]]
    
    /* standard dom */
    inline def exports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleExportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("exports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleExportDescriptor]]
    
    /* standard dom */
    inline def imports(moduleObject: typings.std.WebAssembly.Module): js.Array[ModuleImportDescriptor] = ^.asInstanceOf[js.Dynamic].applyDynamic("imports")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Array[ModuleImportDescriptor]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Module")
  @js.native
  open class ModuleCls protected ()
    extends StObject
       with Module {
    /* standard dom */
    def this(bytes: BufferSource) = this()
  }
  
  /* standard dom */
  inline def RuntimeError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("RuntimeError")().asInstanceOf[js.Error]
  inline def RuntimeError(message: java.lang.String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("RuntimeError")(message.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.RuntimeError")
  @js.native
  /* standard dom */
  open class RuntimeErrorCls ()
    extends StObject
       with typings.std.Error {
    def this(message: java.lang.String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: java.lang.String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: java.lang.String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("WebAssembly.Table")
  @js.native
  open class TableCls protected ()
    extends StObject
       with Table {
    /* standard dom */
    def this(descriptor: TableDescriptor) = this()
    def this(descriptor: TableDescriptor, value: Any) = this()
  }
  
  inline def compile(bytes: BufferSource): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  inline def compileStreaming(source: js.Thenable[typings.std.Response]): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  inline def compileStreaming(source: typings.std.Response): js.Promise[Module] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Module]]
  
  inline def instantiate(bytes: BufferSource): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiate(bytes: BufferSource, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(bytes.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiate(moduleObject: Module): js.Promise[Instance] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Instance]]
  inline def instantiate(moduleObject: Module, importObject: Imports): js.Promise[Instance] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiate")(moduleObject.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Instance]]
  
  inline def instantiateStreaming(source: js.Thenable[typings.std.Response]): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: js.Thenable[typings.std.Response], importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: typings.std.Response): js.Promise[WebAssemblyInstantiatedSource] = ^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  inline def instantiateStreaming(source: typings.std.Response, importObject: Imports): js.Promise[WebAssemblyInstantiatedSource] = (^.asInstanceOf[js.Dynamic].applyDynamic("instantiateStreaming")(source.asInstanceOf[js.Any], importObject.asInstanceOf[js.Any])).asInstanceOf[js.Promise[WebAssemblyInstantiatedSource]]
  
  inline def validate(bytes: BufferSource): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("validate")(bytes.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
