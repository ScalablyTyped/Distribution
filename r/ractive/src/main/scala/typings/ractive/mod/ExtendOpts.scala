package typings.ractive.mod

import typings.ractive.anon.Optional
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExtendOpts[T /* <: Ractive[T] */]
  extends StObject
     with BaseInitOpts[T] {
  
  /** A list of attributes to be reserved by a component. Any additional attributes are collected into the extra-attributes partial. */
  var attributes: js.UndefOr[js.Array[String] | Optional] = js.undefined
  
  /** The css to add to the page when the first instance of this component is rendered. */
  var css: js.UndefOr[String | CssFn] = js.undefined
  
  /** Default data to be supplied to any css functions. */
  var cssData: js.UndefOr[ValueMap] = js.undefined
  
  /** The id to use when transforming css to be scoped. Defaults to a random guid. */
  var cssId: js.UndefOr[String] = js.undefined
  
  /** A function supplying the default data for instances of this component. */
  var data: js.UndefOr[DataFn[T]] = js.undefined
  
  /** Whether or not data and plugins can be pulled from parent instances. Defaults to false. */
  var isolated: js.UndefOr[Boolean] = js.undefined
  
  /** If true, css selectors will not be scoped using the cssId of this component. */
  var noCssTransform: js.UndefOr[Boolean] = js.undefined
  
  /** An array of plugins to apply to the component. */
  var use: js.UndefOr[js.Array[Plugin]] = js.undefined
}
object ExtendOpts {
  
  inline def apply[T /* <: Ractive[T] */](): ExtendOpts[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExtendOpts[T]]
  }
  
  extension [Self <: ExtendOpts[?], T /* <: Ractive[T] */](x: Self & ExtendOpts[T]) {
    
    inline def setAttributes(value: js.Array[String] | Optional): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: String*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCss(value: String | CssFn): Self = StObject.set(x, "css", value.asInstanceOf[js.Any])
    
    inline def setCssData(value: ValueMap): Self = StObject.set(x, "cssData", value.asInstanceOf[js.Any])
    
    inline def setCssDataUndefined: Self = StObject.set(x, "cssData", js.undefined)
    
    inline def setCssFunction1(value: /* data */ DataGetFn => String): Self = StObject.set(x, "css", js.Any.fromFunction1(value))
    
    inline def setCssId(value: String): Self = StObject.set(x, "cssId", value.asInstanceOf[js.Any])
    
    inline def setCssIdUndefined: Self = StObject.set(x, "cssId", js.undefined)
    
    inline def setCssUndefined: Self = StObject.set(x, "css", js.undefined)
    
    inline def setData(value: DataFn[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setIsolated(value: Boolean): Self = StObject.set(x, "isolated", value.asInstanceOf[js.Any])
    
    inline def setIsolatedUndefined: Self = StObject.set(x, "isolated", js.undefined)
    
    inline def setNoCssTransform(value: Boolean): Self = StObject.set(x, "noCssTransform", value.asInstanceOf[js.Any])
    
    inline def setNoCssTransformUndefined: Self = StObject.set(x, "noCssTransform", js.undefined)
    
    inline def setUse(value: js.Array[Plugin]): Self = StObject.set(x, "use", value.asInstanceOf[js.Any])
    
    inline def setUseUndefined: Self = StObject.set(x, "use", js.undefined)
    
    inline def setUseVarargs(value: Plugin*): Self = StObject.set(x, "use", js.Array(value*))
  }
}
