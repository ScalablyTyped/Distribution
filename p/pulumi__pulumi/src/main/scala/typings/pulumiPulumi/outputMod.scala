package typings.pulumiPulumi

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.Array
import typings.std.Record
import typings.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outputMod {
  
  @JSImport("@pulumi/pulumi/output", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/output", "Output")
  @js.native
  val Output_ : OutputConstructor = js.native
  
  type Output_[T] = OutputInstance[T] & Lifted[T]
  
  inline def all[T](ds: js.Array[js.UndefOr[Input[T]]]): typings.pulumiPulumi.outputMod.Output_[js.Array[Unwrap[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(ds.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Array[Unwrap[T]]]]
  inline def all[T](`val`: Record[String, Input[T]]): typings.pulumiPulumi.outputMod.Output_[Record[String, Unwrap[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Record[String, Unwrap[T]]]]
  inline def all[T1, T2](values: js.Tuple2[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]]]): typings.pulumiPulumi.outputMod.Output_[js.Tuple2[Unwrap[T1], Unwrap[T2]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple2[Unwrap[T1], Unwrap[T2]]]]
  inline def all[T1, T2, T3](values: js.Tuple3[js.UndefOr[Input[T1]], js.UndefOr[Input[T2]], js.UndefOr[Input[T3]]]): typings.pulumiPulumi.outputMod.Output_[js.Tuple3[Unwrap[T1], Unwrap[T2], Unwrap[T3]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple3[Unwrap[T1], Unwrap[T2], Unwrap[T3]]]]
  inline def all[T1, T2, T3, T4](
    values: js.Tuple4[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[js.Tuple4[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple4[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4]]]]
  inline def all[T1, T2, T3, T4, T5](
    values: js.Tuple5[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[js.Tuple5[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[js.Tuple5[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5]]]]
  inline def all[T1, T2, T3, T4, T5, T6](
    values: js.Tuple6[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[
    js.Tuple6[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[
    js.Tuple6[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6]]
  ]]
  inline def all[T1, T2, T3, T4, T5, T6, T7](
    values: js.Tuple7[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[
    js.Tuple7[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[
    js.Tuple7[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7]]
  ]]
  inline def all[T1, T2, T3, T4, T5, T6, T7, T8](
    values: js.Tuple8[
      js.UndefOr[Input[T1]], 
      js.UndefOr[Input[T2]], 
      js.UndefOr[Input[T3]], 
      js.UndefOr[Input[T4]], 
      js.UndefOr[Input[T5]], 
      js.UndefOr[Input[T6]], 
      js.UndefOr[Input[T7]], 
      js.UndefOr[Input[T8]]
    ]
  ): typings.pulumiPulumi.outputMod.Output_[
    js.Tuple8[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7], Unwrap[T8]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(values.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[
    js.Tuple8[Unwrap[T1], Unwrap[T2], Unwrap[T3], Unwrap[T4], Unwrap[T5], Unwrap[T6], Unwrap[T7], Unwrap[T8]]
  ]]
  
  inline def concat(params: Input[js.Any]*): typings.pulumiPulumi.outputMod.Output_[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("concat")(params.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  
  inline def containsUnknowns(value: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("containsUnknowns")(value.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def interpolate(literals: TemplateStringsArray, placeholders: Input[js.Any]*): typings.pulumiPulumi.outputMod.Output_[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolate")(literals.asInstanceOf[js.Any], placeholders.asInstanceOf[js.Any])).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[String]]
  
  inline def isUnknown(`val`: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnknown")(`val`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def output[T](): typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("output")().asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]]]
  inline def output[T](`val`: Input[T]): typings.pulumiPulumi.outputMod.Output_[Unwrap[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("output")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[T]]]
  
  inline def secret[T](): typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")().asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]]]
  inline def secret[T](`val`: Input[T]): typings.pulumiPulumi.outputMod.Output_[Unwrap[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("secret")(`val`.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiPulumi.outputMod.Output_[Unwrap[T]]]
  
  type Input[T] = T | js.Promise[T] | OutputInstance[T]
  
  type Inputs = Record[String, Input[js.Any]]
  
  type Lifted[T] = js.Object | (LiftedObject[String | T, NonFunctionPropertyNames[String | T]]) | LiftedArray[js.Any]
  
  trait LiftedArray[T]
    extends StObject
       with /* n */ NumberDictionary[typings.pulumiPulumi.outputMod.Output_[T]] {
    
    /**
      * Gets the length of the array. This is a number one higher than the highest element defined
      * in an array.
      */
    val length: typings.pulumiPulumi.outputMod.Output_[Double]
  }
  object LiftedArray {
    
    inline def apply[T](length: typings.pulumiPulumi.outputMod.Output_[Double]): LiftedArray[T] = {
      val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
      __obj.asInstanceOf[LiftedArray[T]]
    }
    
    extension [Self <: LiftedArray[?], T](x: Self & LiftedArray[T]) {
      
      inline def setLength(value: typings.pulumiPulumi.outputMod.Output_[Double]): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    }
  }
  
  type LiftedObject[T, K /* <: /* keyof T */ String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: T[P] extends @pulumi/pulumi.@pulumi/pulumi/output.OutputInstance<infer T1>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : T[P] extends std.Promise<infer T2>? @pulumi/pulumi.@pulumi/pulumi/output.Output<any> : @pulumi/pulumi.@pulumi/pulumi/output.Output<T[P]>}
    */ typings.pulumiPulumi.pulumiPulumiStrings.LiftedObject & TopLevel[js.Any]
  
  type NonFunctionPropertyNames[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? never : K}[keyof T] */ js.Any
  
  @js.native
  trait OutputConstructor extends StObject {
    
    def create[T](): typings.pulumiPulumi.outputMod.Output_[Unwrap[js.UndefOr[T]]] = js.native
    def create[T](`val`: Input[T]): typings.pulumiPulumi.outputMod.Output_[Unwrap[T]] = js.native
    
    def isInstance[T](obj: js.Any): /* is @pulumi/pulumi.@pulumi/pulumi/output.Output<T> */ Boolean = js.native
  }
  
  @js.native
  trait OutputInstance[T] extends StObject {
    
    /**
      * Transforms the data of the output with the provided func.  The result remains a
      * Output so that dependent resources can be properly tracked.
      *
      * 'func' is not allowed to make resources.
      *
      * 'func' can return other Outputs.  This can be handy if you have a Output<SomeVal>
      * and you want to get a transitive dependency of it.  i.e.
      *
      * ```ts
      * var d1: Output<SomeVal>;
      * var d2 = d1.apply(v => v.x.y.OtherOutput); // getting an output off of 'v'.
      * ```
      *
      * In this example, taking a dependency on d2 means a resource will depend on all the resources
      * of d1.  It will *also* depend on the resources of v.x.y.OtherDep.
      *
      * Importantly, the Resources that d2 feels like it will depend on are the same resources as d1.
      * If you need have multiple Outputs and a single Output is needed that combines both
      * set of resources, then 'pulumi.all' should be used instead.
      *
      * This function will only be called execution of a 'pulumi up' request.  It will not run
      * during 'pulumi preview' (as the values of resources are of course not known then). It is not
      * available for functions that end up executing in the cloud during runtime.  To get the value
      * of the Output during cloud runtime execution, use `get()`.
      */
    @JSName("apply")
    def apply[U](func: js.Function1[/* t */ T, OutputInstance[U] | js.Promise[U] | U]): typings.pulumiPulumi.outputMod.Output_[U] = js.native
    
    /**
      * Retrieves the underlying value of this dependency.
      *
      * This function is only callable in code that runs in the cloud post-deployment.  At this
      * point all Output values will be known and can be safely retrieved. During pulumi deployment
      * or preview execution this must not be called (and will throw).  This is because doing so
      * would allow Output values to flow into Resources while losing the data that would allow
      * the dependency graph to be changed.
      */
    def get(): T = js.native
  }
  
  type Unwrap[T] = UnwrapSimple[js.Any | T]
  
  type UnwrapSimple[T] = UnwrappedObject[T] | UnwrappedArray[js.Any] | T
  
  @js.native
  trait UnwrappedArray[T]
    extends StObject
       with Array[Unwrap[T]]
  
  type UnwrappedObject[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @pulumi/pulumi.@pulumi/pulumi/output.Unwrap<T[P]>}
    */ typings.pulumiPulumi.pulumiPulumiStrings.UnwrappedObject & TopLevel[T]
  
  type primitive = js.UndefOr[js.Function | String | Double | Boolean | Null]
}
