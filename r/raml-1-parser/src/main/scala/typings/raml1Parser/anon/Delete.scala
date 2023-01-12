package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delete extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
  
  @JSName("/\\(.+\\)/")
  var SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String
  
  @JSName("//.+/")
  var SlashSlashDotPlussignSlash: java.lang.String
  
  var delete: java.lang.String
  
  var get: java.lang.String
  
  var head: java.lang.String
  
  var is: java.lang.String
  
  var options: java.lang.String
  
  var patch: java.lang.String
  
  var post: java.lang.String
  
  var put: java.lang.String
  
  var securedBy: java.lang.String
  
  var `type`: ActionString
  
  var uriParameters: Action
}
object Delete {
  
  inline def apply(
    $action: java.lang.String,
    SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash: java.lang.String,
    SlashSlashDotPlussignSlash: java.lang.String,
    delete: java.lang.String,
    get: java.lang.String,
    head: java.lang.String,
    is: java.lang.String,
    options: java.lang.String,
    patch: java.lang.String,
    post: java.lang.String,
    put: java.lang.String,
    securedBy: java.lang.String,
    `type`: ActionString,
    uriParameters: Action
  ): Delete = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], put = put.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], uriParameters = uriParameters.asInstanceOf[js.Any])
    __obj.updateDynamic("/\\(.+\\)/")(SlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash.asInstanceOf[js.Any])
    __obj.updateDynamic("//.+/")(SlashSlashDotPlussignSlash.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delete]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
    
    inline def setDelete(value: java.lang.String): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setGet(value: java.lang.String): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    inline def setHead(value: java.lang.String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
    
    inline def setIs(value: java.lang.String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: java.lang.String): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setPatch(value: java.lang.String): Self = StObject.set(x, "patch", value.asInstanceOf[js.Any])
    
    inline def setPost(value: java.lang.String): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
    
    inline def setPut(value: java.lang.String): Self = StObject.set(x, "put", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: java.lang.String): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setSlashBackslashLeftparenthesisDotPlussignBackslashRightparenthesisSlash(value: java.lang.String): Self = StObject.set(x, "/\\(.+\\)/", value.asInstanceOf[js.Any])
    
    inline def setSlashSlashDotPlussignSlash(value: java.lang.String): Self = StObject.set(x, "//.+/", value.asInstanceOf[js.Any])
    
    inline def setType(value: ActionString): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUriParameters(value: Action): Self = StObject.set(x, "uriParameters", value.asInstanceOf[js.Any])
  }
}
