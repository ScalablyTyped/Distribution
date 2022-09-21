package typings.reactNativeCommunityCliPlatformIos.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Booted extends StObject {
  
  var booted: Boolean
  
  var name: String
  
  var udid: String
  
  var version: String
}
object Booted {
  
  inline def apply(booted: Boolean, name: String, udid: String, version: String): Booted = {
    val __obj = js.Dynamic.literal(booted = booted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], udid = udid.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Booted]
  }
  
  extension [Self <: Booted](x: Self) {
    
    inline def setBooted(value: Boolean): Self = StObject.set(x, "booted", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
