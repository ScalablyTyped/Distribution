package typings
package qunitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failed extends js.Object {
  var failed: scala.Double
  var module: java.lang.String
  var name: java.lang.String
  var passed: scala.Double
  var runtime: scala.Double
  var total: scala.Double
}

object Anon_Failed {
  @scala.inline
  def apply(
    failed: scala.Double,
    module: java.lang.String,
    name: java.lang.String,
    passed: scala.Double,
    runtime: scala.Double,
    total: scala.Double
  ): Anon_Failed = {
    val __obj = js.Dynamic.literal(failed = failed, module = module, name = name, passed = passed, runtime = runtime, total = total)
  
    __obj.asInstanceOf[Anon_Failed]
  }
}

