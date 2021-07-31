package typings.semanticUiEmbed.anon

import typings.semanticUiEmbed.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-embed.SemanticUI.EmbedSettings._Impl, 'onCreate'> */
trait PickImplonCreate extends StObject {
  
  def onCreate(url: String): Unit
  @JSName("onCreate")
  var onCreate_Original: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]
}
object PickImplonCreate {
  
  @scala.inline
  def apply(onCreate: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]): PickImplonCreate = {
    val __obj = js.Dynamic.literal(onCreate = onCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplonCreate]
  }
  
  @scala.inline
  implicit class PickImplonCreateMutableBuilder[Self <: PickImplonCreate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnCreate(value: js.ThisFunction1[/* this */ JQuery, /* url */ String, Unit]): Self = StObject.set(x, "onCreate", value.asInstanceOf[js.Any])
  }
}
