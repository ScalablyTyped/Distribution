package typings.qunit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Failed extends js.Object {
  var failed: Double
  var module: String
  var name: String
  var passed: Double
  var runtime: Double
  var total: Double
}

object Anon_Failed {
  @scala.inline
  def apply(failed: Double, module: String, name: String, passed: Double, runtime: Double, total: Double): Anon_Failed = {
    val __obj = js.Dynamic.literal(failed = failed.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passed = passed.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Failed]
  }
}

