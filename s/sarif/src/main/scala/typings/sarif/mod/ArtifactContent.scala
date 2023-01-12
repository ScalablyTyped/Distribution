package typings.sarif.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtifactContent extends StObject {
  
  /**
    * MIME Base64-encoded content from a binary artifact, or from a text artifact in its original encoding.
    */
  var binary: js.UndefOr[String] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the artifact content.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * An alternate rendered representation of the artifact (e.g., a decompiled representation of a binary region).
    */
  var rendered: js.UndefOr[MultiformatMessageString] = js.undefined
  
  /**
    * UTF-8-encoded content from a text artifact.
    */
  var text: js.UndefOr[String] = js.undefined
}
object ArtifactContent {
  
  inline def apply(): ArtifactContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ArtifactContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtifactContent] (val x: Self) extends AnyVal {
    
    inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
    
    inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setRendered(value: MultiformatMessageString): Self = StObject.set(x, "rendered", value.asInstanceOf[js.Any])
    
    inline def setRenderedUndefined: Self = StObject.set(x, "rendered", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
