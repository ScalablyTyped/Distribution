package typings.rss.rssMod

import org.scalablytyped.runtime.TopLevel
import typings.rss.rssMod.NodeRSS.FeedOptions
import typings.rss.rssMod.NodeRSS.RSS
import typings.rss.rssMod.NodeRSS.RSSFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rss", JSImport.Namespace)
@js.native
class ^ protected () extends RSS {
  /**
    * Create an RSS feed with options.
    * @param {FeedOptions} feedOptions - Options for the RSS feed.
    * @returns {RSS}
    */
  def this(feedOptions: FeedOptions) = this()
}

@JSImport("rss", JSImport.Namespace)
@js.native
object ^ extends TopLevel[RSSFactory]

