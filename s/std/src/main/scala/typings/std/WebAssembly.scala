package typings.std

import typings.std.stdStrings.anyfunc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebAssembly {
  
  @js.native
  trait CompileError extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - js.Function
    - typings.std.WebAssembly.Global
    - typings.std.WebAssembly.Memory
    - typings.std.WebAssembly.Table
  */
  type ExportValue = _ExportValue | js.Function
  
  type Exports = Record[java.lang.String, ExportValue]
  
  @js.native
  trait Global extends _ExportValue {
    
    var value: js.Any = js.native
  }
  object Global {
    
    @scala.inline
    def apply(value: js.Any): Global = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Global]
    }
    
    @scala.inline
    implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GlobalDescriptor extends StObject {
    
    var mutable: js.UndefOr[scala.Boolean] = js.native
    
    var value: ValueType = js.native
  }
  object GlobalDescriptor {
    
    @scala.inline
    def apply(value: ValueType): GlobalDescriptor = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalDescriptor]
    }
    
    @scala.inline
    implicit class GlobalDescriptorMutableBuilder[Self <: GlobalDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMutable(value: scala.Boolean): Self = StObject.set(x, "mutable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutableUndefined: Self = StObject.set(x, "mutable", js.undefined)
      
      @scala.inline
      def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def function: typings.std.stdStrings.function = "function".asInstanceOf[typings.std.stdStrings.function]
    
    @scala.inline
    def global: typings.std.stdStrings.global = "global".asInstanceOf[typings.std.stdStrings.global]
    
    @scala.inline
    def memory: typings.std.stdStrings.memory = "memory".asInstanceOf[typings.std.stdStrings.memory]
    
    @scala.inline
    def table: typings.std.stdStrings.table = "table".asInstanceOf[typings.std.stdStrings.table]
  }
  
  type ImportValue = ExportValue | Double
  
  type Imports = Record[java.lang.String, ModuleImports]
  
  @js.native
  trait Instance extends StObject {
    
    val exports: Exports = js.native
  }
  object Instance {
    
    @scala.inline
    def apply(exports: Exports): Instance = {
      val __obj = js.Dynamic.literal(exports = exports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Instance]
    }
    
    @scala.inline
    implicit class InstanceMutableBuilder[Self <: Instance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExports(value: Exports): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LinkError extends StObject
  
  @js.native
  trait Memory extends _ExportValue {
    
    val buffer: ArrayBuffer = js.native
    
    def grow(delta: Double): Double = js.native
  }
  object Memory {
    
    @scala.inline
    def apply(buffer: ArrayBuffer, grow: Double => Double): Memory = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], grow = js.Any.fromFunction1(grow))
      __obj.asInstanceOf[Memory]
    }
    
    @scala.inline
    implicit class MemoryMutableBuilder[Self <: Memory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBuffer(value: ArrayBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrow(value: Double => Double): Self = StObject.set(x, "grow", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait MemoryDescriptor extends StObject {
    
    var initial: Double = js.native
    
    var maximum: js.UndefOr[Double] = js.native
  }
  object MemoryDescriptor {
    
    @scala.inline
    def apply(initial: Double): MemoryDescriptor = {
      val __obj = js.Dynamic.literal(initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[MemoryDescriptor]
    }
    
    @scala.inline
    implicit class MemoryDescriptorMutableBuilder[Self <: MemoryDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    }
  }
  
  @js.native
  trait Module extends StObject
  
  @js.native
  trait ModuleExportDescriptor extends StObject {
    
    var kind: ImportExportKind = js.native
    
    var name: java.lang.String = js.native
  }
  object ModuleExportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, name: java.lang.String): ModuleExportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleExportDescriptor]
    }
    
    @scala.inline
    implicit class ModuleExportDescriptorMutableBuilder[Self <: ModuleExportDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ModuleImportDescriptor extends StObject {
    
    var kind: ImportExportKind = js.native
    
    var module: java.lang.String = js.native
    
    var name: java.lang.String = js.native
  }
  object ModuleImportDescriptor {
    
    @scala.inline
    def apply(kind: ImportExportKind, module: java.lang.String, name: java.lang.String): ModuleImportDescriptor = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModuleImportDescriptor]
    }
    
    @scala.inline
    implicit class ModuleImportDescriptorMutableBuilder[Self <: ModuleImportDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKind(value: ImportExportKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: java.lang.String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ModuleImports = Record[java.lang.String, ImportValue]
  
  @js.native
  trait RuntimeError extends StObject
  
  @js.native
  trait Table extends _ExportValue {
    
    def get(index: Double): js.Function | Null = js.native
    
    def grow(delta: Double): Double = js.native
    
    val length: Double = js.native
    
    def set(index: Double): Unit = js.native
    def set(index: Double, value: js.Function): Unit = js.native
  }
  
  @js.native
  trait TableDescriptor extends StObject {
    
    var element: TableKind = js.native
    
    var initial: Double = js.native
    
    var maximum: js.UndefOr[Double] = js.native
  }
  object TableDescriptor {
    
    @scala.inline
    def apply(element: TableKind, initial: Double): TableDescriptor = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDescriptor]
    }
    
    @scala.inline
    implicit class TableDescriptorMutableBuilder[Self <: TableDescriptor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: TableKind): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitial(value: Double): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximum(value: Double): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
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
    
    @scala.inline
    def f32: typings.std.stdStrings.f32 = "f32".asInstanceOf[typings.std.stdStrings.f32]
    
    @scala.inline
    def f64: typings.std.stdStrings.f64 = "f64".asInstanceOf[typings.std.stdStrings.f64]
    
    @scala.inline
    def i32: typings.std.stdStrings.i32 = "i32".asInstanceOf[typings.std.stdStrings.i32]
    
    @scala.inline
    def i64: typings.std.stdStrings.i64 = "i64".asInstanceOf[typings.std.stdStrings.i64]
  }
  
  @js.native
  trait WebAssemblyInstantiatedSource extends StObject {
    
    var instance: Instance = js.native
    
    var module: Module = js.native
  }
  object WebAssemblyInstantiatedSource {
    
    @scala.inline
    def apply(instance: Instance, module: Module): WebAssemblyInstantiatedSource = {
      val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any])
      __obj.asInstanceOf[WebAssemblyInstantiatedSource]
    }
    
    @scala.inline
    implicit class WebAssemblyInstantiatedSourceMutableBuilder[Self <: WebAssemblyInstantiatedSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInstance(value: Instance): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModule(value: Module): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
    }
  }
  
  trait _ExportValue extends StObject
}
