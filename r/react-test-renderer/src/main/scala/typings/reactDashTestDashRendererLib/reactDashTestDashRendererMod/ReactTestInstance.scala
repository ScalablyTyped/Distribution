package typings
package reactDashTestDashRendererLib.reactDashTestDashRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactTestInstance extends js.Object {
  var children: js.Array[ReactTestInstance | java.lang.String] = js.native
  var instance: js.Any = js.native
  var parent: scala.Null | ReactTestInstance = js.native
  var props: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  var `type`: reactLib.reactMod.ReactType[_] = js.native
  def find(predicate: js.Function1[/* node */ this.type, scala.Boolean]): ReactTestInstance = js.native
  def findAll(predicate: js.Function1[/* node */ this.type, scala.Boolean]): js.Array[ReactTestInstance] = js.native
  def findAll(
    predicate: js.Function1[/* node */ this.type, scala.Boolean],
    options: reactDashTestDashRendererLib.Anon_Deep
  ): js.Array[ReactTestInstance] = js.native
  def findAllByProps(props: org.scalablytyped.runtime.StringDictionary[js.Any]): js.Array[ReactTestInstance] = js.native
  def findAllByProps(
    props: org.scalablytyped.runtime.StringDictionary[js.Any],
    options: reactDashTestDashRendererLib.Anon_Deep
  ): js.Array[ReactTestInstance] = js.native
  def findAllByType(`type`: reactLib.reactMod.ReactType[_]): js.Array[ReactTestInstance] = js.native
  def findAllByType(`type`: reactLib.reactMod.ReactType[_], options: reactDashTestDashRendererLib.Anon_Deep): js.Array[ReactTestInstance] = js.native
  def findByProps(props: org.scalablytyped.runtime.StringDictionary[js.Any]): ReactTestInstance = js.native
  def findByType(`type`: reactLib.reactMod.ReactType[_]): ReactTestInstance = js.native
}

