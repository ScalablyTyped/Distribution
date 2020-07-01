package typings.serverlessTencentScf.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  var key: String
  var meta: StringDictionary[String]
  var size: Double
  var url: String
  var vid: String
}

object Key {
  @scala.inline
  def apply(key: String, meta: StringDictionary[String], size: Double, url: String, vid: String): Key = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], vid = vid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

