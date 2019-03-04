package typings
package ptyDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Master extends js.Object {
  var master: scala.Double
  var pty: java.lang.String
  var slave: scala.Double
}

object Anon_Master {
  @scala.inline
  def apply(master: scala.Double, pty: java.lang.String, slave: scala.Double): Anon_Master = {
    val __obj = js.Dynamic.literal(master = master, pty = pty, slave = slave)
  
    __obj.asInstanceOf[Anon_Master]
  }
}

