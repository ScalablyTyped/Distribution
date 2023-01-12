package typings.steamUser.anon

import typings.std.Record
import typings.steamUser.mod.Emoticon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Emoticons extends StObject {
  
  var emoticons: Record[String, Emoticon]
}
object Emoticons {
  
  inline def apply(emoticons: Record[String, Emoticon]): Emoticons = {
    val __obj = js.Dynamic.literal(emoticons = emoticons.asInstanceOf[js.Any])
    __obj.asInstanceOf[Emoticons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Emoticons] (val x: Self) extends AnyVal {
    
    inline def setEmoticons(value: Record[String, Emoticon]): Self = StObject.set(x, "emoticons", value.asInstanceOf[js.Any])
  }
}
