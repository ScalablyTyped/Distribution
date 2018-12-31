package typings
package reduxDashPersistLib.esTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebStorage extends js.Object {
  /**
    * Fetches key and returns item in a promise.
    */
  def getItem(key: java.lang.String): js.Promise[java.lang.String]
  /**
    * Removes value for key.
    */
  def removeItem(key: java.lang.String): js.Promise[scala.Unit]
  /**
    * Sets value for key and returns item in a promise.
    */
  def setItem(key: java.lang.String, item: java.lang.String): js.Promise[java.lang.String]
}

