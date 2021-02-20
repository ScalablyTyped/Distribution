package typings.reactMdForm.typesMod

import typings.std.MouseEvent
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderActionCreators extends StObject {
  
  def decrement(): Unit = js.native
  
  def drag(event: MouseEvent): Unit = js.native
  def drag(event: TouchEvent): Unit = js.native
  
  def increment(): Unit = js.native
  
  def maximum(): Unit = js.native
  
  def minimum(): Unit = js.native
  
  def setValue(value: Double): Unit = js.native
  
  def stop(): Unit = js.native
}
