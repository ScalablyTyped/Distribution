package typings.stremioAddonSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Genre extends StObject {
  
  var genre: String
  
  var search: String
  
  var skip: Double
}
object Genre {
  
  @scala.inline
  def apply(genre: String, search: String, skip: Double): Genre = {
    val __obj = js.Dynamic.literal(genre = genre.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Genre]
  }
  
  @scala.inline
  implicit class GenreMutableBuilder[Self <: Genre] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGenre(value: String): Self = StObject.set(x, "genre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearch(value: String): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
  }
}
