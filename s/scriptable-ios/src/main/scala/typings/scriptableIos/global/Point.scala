package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Structure representing a point._
  * @see https://docs.scriptable.app/point/#-new-point
  */
@JSGlobal("Point")
@js.native
open class Point protected ()
  extends StObject
     with typings.scriptableIos.Point {
  /**
    * _Structure representing a point._
    * @param x - X value.
    * @param y - Y value.
    * @see https://docs.scriptable.app/point/#-new-point
    */
  def this(x: Double, y: Double) = this()
  
  /**
    * _X value._
    * @see https://docs.scriptable.app/point/#x
    */
  /* CompleteClass */
  var x: Double = js.native
  
  /**
    * _Y value._
    * @see https://docs.scriptable.app/point/#y
    */
  /* CompleteClass */
  var y: Double = js.native
}
