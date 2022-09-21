package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Linear gradient._
  * @see https://docs.scriptable.app/lineargradient/#-new-lineargradient
  */
@JSGlobal("LinearGradient")
@js.native
/**
  * _Linear gradient._
  * @see https://docs.scriptable.app/lineargradient/#-new-lineargradient
  */
open class LinearGradient ()
  extends StObject
     with typings.scriptableIos.LinearGradient {
  
  /**
    * _Colors of the gradient._
    *
    * The array of colors should include the same amount of elements as the gradients `locations` property.
    * @see https://docs.scriptable.app/lineargradient/#colors
    */
  /* CompleteClass */
  var colors: js.Array[typings.scriptableIos.Color] = js.native
  
  /**
    * _Point to end the gradient._
    *
    * The normalized ending point of the gradient. The `endPoint` and `startPoint` together controls the direction of the gradient. The X and Y component should each range from 0 to 1.
    * Defaults to (0, 1).
    * @see https://docs.scriptable.app/lineargradient/#endpoint
    */
  /* CompleteClass */
  var endPoint: typings.scriptableIos.Point = js.native
  
  /**
    * _Locations of each color._
    *
    * Each location should be a value in the range of 0 to 1 and indicates the location of each color in the gradients `colors` array.
    *
    * The array of locations should include the same amount of elements as the gradients `colors` property.
    * @see https://docs.scriptable.app/lineargradient/#locations
    */
  /* CompleteClass */
  var locations: js.Array[Double] = js.native
  
  /**
    * _Point to start the gradient._
    *
    * The normalized starting point of the gradient. The `endPoint` and `startPoint` together controls the direction of the gradient. The X and Y component should each range from 0 to 1.
    * Defaults to (0, 1).
    * @see https://docs.scriptable.app/lineargradient/#startpoint
    */
  /* CompleteClass */
  var startPoint: typings.scriptableIos.Point = js.native
}
