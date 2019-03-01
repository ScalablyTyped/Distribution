package typings
package reduxDashFormLib.libReducerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormReducerMapObject
  extends // and `<any>` to make it compatible with redux@3
// tslint:disable-next-line use-default-type-parameter
/* formName */ org.scalablytyped.runtime.StringDictionary[reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]]

object FormReducerMapObject {
  @scala.inline
  def apply(
    StringDictionary: // and `<any>` to make it compatible with redux@3
  // tslint:disable-next-line use-default-type-parameter
  /* formName */ org.scalablytyped.runtime.StringDictionary[reduxLib.reduxMod.Reducer[_, reduxLib.reduxMod.AnyAction]] = null
  ): FormReducerMapObject = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[FormReducerMapObject]
  }
}

