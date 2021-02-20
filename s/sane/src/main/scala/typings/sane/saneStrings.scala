package typings.sane

import typings.sane.mod.AllEventType
import typings.sane.mod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object saneStrings {
  
  @js.native
  sealed trait add
    extends AllEventType
       with EventType
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  
  @js.native
  sealed trait all extends EventType
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait change
    extends AllEventType
       with EventType
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait delete
    extends AllEventType
       with EventType
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait error extends EventType
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait ready extends EventType
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
}
