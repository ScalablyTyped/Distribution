package typings.siege

import typings.siege.mod.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object siegeStrings {
  
  @js.native
  sealed trait GET
    extends StObject
       with Method
  inline def GET: GET = "GET".asInstanceOf[GET]
  
  @js.native
  sealed trait POST
    extends StObject
       with Method
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait color extends StObject
  inline def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait json extends StObject
  inline def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait plain extends StObject
  inline def plain: plain = "plain".asInstanceOf[plain]
}
