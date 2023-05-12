package typings.reactFit

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.std.NonNullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Validator[Double]
    
    var left: Validator[Double]
    
    var right: Validator[Double]
    
    var top: Validator[Double]
  }
  object Bottom {
    
    inline def apply(
      bottom: Validator[Double],
      left: Validator[Double],
      right: Validator[Double],
      top: Validator[Double]
    ): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Validator[Double]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Validator[Double]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Validator[Double]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Validator[Double]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: Validator[NonNullable[ReactNodeLike]]
    
    var invertAxis: Requireable[Boolean]
    
    var invertSecondaryAxis: Requireable[Boolean]
    
    var mainAxis: Requireable[String]
    
    var spacing: Requireable[NonNullable[js.UndefOr[Double | InferProps[Bottom] | Null]]]
  }
  object Children {
    
    inline def apply(
      children: Validator[NonNullable[ReactNodeLike]],
      invertAxis: Requireable[Boolean],
      invertSecondaryAxis: Requireable[Boolean],
      mainAxis: Requireable[String],
      spacing: Requireable[NonNullable[js.UndefOr[Double | InferProps[Bottom] | Null]]]
    ): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], invertAxis = invertAxis.asInstanceOf[js.Any], invertSecondaryAxis = invertSecondaryAxis.asInstanceOf[js.Any], mainAxis = mainAxis.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: Validator[NonNullable[ReactNodeLike]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setInvertAxis(value: Requireable[Boolean]): Self = StObject.set(x, "invertAxis", value.asInstanceOf[js.Any])
      
      inline def setInvertSecondaryAxis(value: Requireable[Boolean]): Self = StObject.set(x, "invertSecondaryAxis", value.asInstanceOf[js.Any])
      
      inline def setMainAxis(value: Requireable[String]): Self = StObject.set(x, "mainAxis", value.asInstanceOf[js.Any])
      
      inline def setSpacing(value: Requireable[NonNullable[js.UndefOr[Double | InferProps[Bottom] | Null]]]): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {[ key in react-fit.react-fit/dist/cjs/Fit.SpacingKeys ]: number} */
  trait keyinSpacingKeysnumber extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object keyinSpacingKeysnumber {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): keyinSpacingKeysnumber = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[keyinSpacingKeysnumber]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: keyinSpacingKeysnumber] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
