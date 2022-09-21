package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Structure representing a size._
  * @see https://docs.scriptable.app/size/#-new-size
  */
@JSGlobal("Size")
@js.native
open class Size protected ()
  extends StObject
     with typings.scriptableIos.Size {
  /**
    * _Structure representing a size._
    * @param width - Width value.
    * @param height - Height value.
    * @see https://docs.scriptable.app/size/#-new-size
    */
  def this(width: Double, height: Double) = this()
  
  /**
    * _Height value._
    * @see https://docs.scriptable.app/size/#height
    */
  /* CompleteClass */
  var height: Double = js.native
  
  /**
    * _Width value._
    * @see https://docs.scriptable.app/size/#width
    */
  /* CompleteClass */
  var width: Double = js.native
}
