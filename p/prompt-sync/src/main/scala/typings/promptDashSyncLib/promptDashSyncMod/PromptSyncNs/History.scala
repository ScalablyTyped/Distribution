package typings
package promptDashSyncLib.promptDashSyncMod.PromptSyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait History extends js.Object {
  def atEnd(): scala.Boolean
  def atPenultimate(): scala.Boolean
  def atStart(): scala.Boolean
  def next(): java.lang.String
  def pastEnd(): scala.Boolean
  def prev(): java.lang.String
  def push(str: java.lang.String): scala.Unit
  def reset(): scala.Unit
  def save(): scala.Unit
}

