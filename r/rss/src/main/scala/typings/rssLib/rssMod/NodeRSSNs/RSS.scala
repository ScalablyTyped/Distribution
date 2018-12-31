package typings
package rssLib.rssMod.NodeRSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RSS extends js.Object {
  /**
    * Add an item to a feed. An item can be used for a blog
    * entry, project update, log entry, etc.
    * @param {ItemOptions} itemOptions
    * @returns {RSS}
    */
  def item(itemOptions: ItemOptions): RSS = js.native
  /**
    * Generate XML and return as a string for this feed.
    * @returns {string}
    */
  def xml(): java.lang.String = js.native
  /**
    * Generate XML and return as a string for this feed.
    *
    * @param {XmlOptions} xmlOptions - You can use indent
    * option to specify the tab character to use.
    * @returns {string}
    */
  def xml(xmlOptions: XmlOptions): java.lang.String = js.native
}

