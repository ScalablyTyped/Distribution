package typings
package prismjsLib.prismjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hooks extends js.Object {
  var all: js.Array[js.Array[js.Function1[/* env */ Environment, scala.Unit]]] = js.native
  def add(name: java.lang.String, callback: HookCallback): scala.Unit = js.native
  def add(name: AvailableHooks, callback: HookCallback): scala.Unit = js.native
  def run(name: java.lang.String, env: Environment): scala.Unit = js.native
  def run(name: AvailableHooks, env: Environment): scala.Unit = js.native
}

