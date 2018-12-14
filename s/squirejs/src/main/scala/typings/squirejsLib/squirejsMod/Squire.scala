package typings
package squirejsLib.squirejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Squire extends js.Object {
  def clean(): Squire = js.native
  def clean(name: java.lang.String): Squire = js.native
  def clean(name: js.Array[java.lang.String]): Squire = js.native
  def mock(mocks: org.scalablytyped.runtime.StringDictionary[js.Any]): Squire = js.native
  def mock(name: java.lang.String, mock: js.Any): Squire = js.native
  def remove(): java.lang.String = js.native
  def require(dependencies: js.Array[java.lang.String], callback: js.Function): Squire = js.native
  def require(dependencies: js.Array[java.lang.String], callback: js.Function, errback: js.Function): Squire = js.native
  def run(dependencies: js.Array[java.lang.String], test: js.Function): js.Function1[/* done */ js.Function, scala.Unit] = js.native
  def store(name: java.lang.String): Squire = js.native
  def store(name: js.Array[java.lang.String]): Squire = js.native
}

