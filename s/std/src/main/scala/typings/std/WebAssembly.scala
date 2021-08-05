package typings.std

import typings.std.stdStrings.anyfunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  trait CompileError extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typings.std.WebAssembly.Global
    - typings.std.WebAssembly.Memory
    - typings.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | js.Function
  
  type Exports = Record[java.lang.String, ExportValue]
  
  trait Global
    extends StObject
       with _ExportValue {
    
    var value: js.Any
  }
  object Global {
    
    inline def apply(value: js.Any): Global = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    extension [Self <: Global](x: Self) {
      
      inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait GlobalDescriptor extends StObject {
    
    var mutable: js.UndefOr[scala.Boolean] = js.undefined
    
    var value: ValueType
  }
  object GlobalDescriptor {
    
    inline def apply(value: ValueType): GlobalDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor]
    }
    
    extension [Self <: GlobalDescriptor](x: Self) {
      
      inline def setMutable(value: scala.Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      inline def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.stdStrings.function
    - typings.std.stdStrings.global
    - typings.std.stdStrings.memory
    - typings.std.stdStrings.table
  */
  trait ImportExportKind extends StObject
  object ImportExportKind {
    
    inline def function: typings.std.stdStrings.function = "function".asInstanceOf[typings.std.stdStrings.function]
    
    inline def global: typings.std.stdStrings.global = "global".asInstanceOf[typings.std.stdStrings.global]
    
    inline def memory: typings.std.stdStrings.memory = "memory".asInstanceOf[typings.std.stdStrings.memory]
    
    inline def table: typings.std.stdStrings.table = "table".asInstanceOf[typings.std.stdStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  trait Instance extends StObject {
    
    val exports: Exports
  }
  object Instance {
    
    inline def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    extension [Self <: Instance](x: Self) {
      
      inline def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkError extends StObject
  
  trait Memory
    extends StObject
       with _ExportValue {
    
    val buffer: ArrayBuffer
    
    def grow(delta: Double): Double
  }
  object Memory {
    
    inline def apply(buffer: ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
    
    extension [Self <: Memory](x: Self) {
      
      inline def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      inline def setGrow(value: Double => Double): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
    }
  }
  
  trait MemoryDescriptor extends StObject {
    
    var initial: Double
    
    var maximum: js.UndefOr[Double] = js.undefined
  }
  object MemoryDescriptor {
    
    inline def apply(initial: Double): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
    
    extension [Self <: MemoryDescriptor](x: Self) {
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  trait Module extends StObject
  
  trait ModuleExportDescriptor extends StObject {
    
    var kind: ImportExportKind
    
    var name: java.lang.String
  }
  object ModuleExportDescriptor {
    
    inline def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
    
    extension [Self <: ModuleExportDescriptor](x: Self) {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModuleImportDescriptor extends StObject {
    
    var kind: ImportExportKind
    
    var module: java.lang.String
    
    var name: java.lang.String
  }
  object ModuleImportDescriptor {
    
    inline def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
    
    extension [Self <: ModuleImportDescriptor](x: Self) {
      
      inline def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModule(value: java.lang.String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  trait RuntimeError extends StObject
  
  @js.native
  trait Table
    extends StObject
       with _ExportValue {
    
    def get(index: Double): js.Function | Null = js.native
    
    def grow(delta: Double): Double = js.native
    
    val length: Double = js.native
    
    def set(index: Double): Unit = js.native
    def set(index: Double, value: js.Function): Unit = js.native
  }
  
  trait TableDescriptor extends StObject {
    
    var element: TableKind
    
    var initial: Double
    
    var maximum: js.UndefOr[Double] = js.undefined
  }
  object TableDescriptor {
    
    inline def apply(element: TableKind, initial: Double): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
    
    extension [Self <: TableDescriptor](x: Self) {
      
      inline def setElement(value: TableKind): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  type TableKind = anyfunc
  
  /* Rewritten from type alias, can be one of: 
    - typings.std.stdStrings.f32
    - typings.std.stdStrings.f64
    - typings.std.stdStrings.i32
    - typings.std.stdStrings.i64
  */
  trait ValueType extends StObject
  object ValueType {
    
    inline def f32: typings.std.stdStrings.f32 = "f32".asInstanceOf[typings.std.stdStrings.f32]
    
    inline def f64: typings.std.stdStrings.f64 = "f64".asInstanceOf[typings.std.stdStrings.f64]
    
    inline def i32: typings.std.stdStrings.i32 = "i32".asInstanceOf[typings.std.stdStrings.i32]
    
    inline def i64: typings.std.stdStrings.i64 = "i64".asInstanceOf[typings.std.stdStrings.i64]
  }
  
  trait WebAssemblyInstantiatedSource extends StObject {
    
    var instance: Instance
    
    var module: Module
  }
  object WebAssemblyInstantiatedSource {
    
    inline def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
    
    extension [Self <: WebAssemblyInstantiatedSource](x: Self) {
      
      inline def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExportValue extends StObject
}
