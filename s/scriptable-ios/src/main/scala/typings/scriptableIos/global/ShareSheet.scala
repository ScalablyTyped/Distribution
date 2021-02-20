package typings.scriptableIos.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * _Offers standard activities to perform on items._
  * @see https://docs.scriptable.app/sharesheet
  */
object ShareSheet {
  
  /**
    * _Presents the activity picker._
    *
    * Presents a share sheet with an array of items to share. The activities included in the presented sheet will vary based on the type of item.
    * @param activityItems - Items to perform activity on.
    * @see https://docs.scriptable.app/sharesheet/#present
    */
  @JSGlobal("ShareSheet.present")
  @js.native
  def present(activityItems: js.Array[_]): js.Promise[_] = js.native
}
