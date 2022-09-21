package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputEvent
  extends StObject
     with UIEvent {
  
  /* standard dom */
  val data: java.lang.String | Null = js.native
  
  /* standard dom */
  val dataTransfer: DataTransfer | Null = js.native
  
  /* standard dom */
  def getTargetRanges(): js.Array[StaticRange] = js.native
  
  /* standard dom */
  val inputType: java.lang.String = js.native
  
  /* standard dom */
  val isComposing: scala.Boolean = js.native
}
