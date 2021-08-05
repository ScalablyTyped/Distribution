package typings.setCookieParser

import typings.setCookieParser.setCookieParserBooleans.`false`
import typings.setCookieParser.setCookieParserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined set-cookie-parser.set-cookie-parser.Options & {  map :false | undefined} */
  trait Optionsmapfalseundefined extends StObject {
    
    /**
      * Calls dcodeURIComponent on each value
      * @default true
      */
    var decodeValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return an object instead of an array
      * @default false
      */
    var map: js.UndefOr[Boolean] & js.UndefOr[`false`]
    
    /**
      * Suppress the warning that is loged when called on a request instead of a response
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsmapfalseundefined {
    
    inline def apply(map: js.UndefOr[Boolean] & js.UndefOr[`false`]): Optionsmapfalseundefined = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsmapfalseundefined]
    }
    
    extension [Self <: Optionsmapfalseundefined](x: Self) {
      
      inline def setDecodeValues(value: Boolean): Self = StObject.set(x, "decodeValues", value.asInstanceOf[js.Any])
      
      inline def setDecodeValuesUndefined: Self = StObject.set(x, "decodeValues", js.undefined)
      
      inline def setMap(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  /* Inlined set-cookie-parser.set-cookie-parser.Options & {  map :true} */
  trait Optionsmaptrue extends StObject {
    
    /**
      * Calls dcodeURIComponent on each value
      * @default true
      */
    var decodeValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Return an object instead of an array
      * @default false
      */
    var map: js.UndefOr[Boolean] & `true`
    
    /**
      * Suppress the warning that is loged when called on a request instead of a response
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsmaptrue {
    
    inline def apply(map: js.UndefOr[Boolean] & `true`): Optionsmaptrue = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsmaptrue]
    }
    
    extension [Self <: Optionsmaptrue](x: Self) {
      
      inline def setDecodeValues(value: Boolean): Self = StObject.set(x, "decodeValues", value.asInstanceOf[js.Any])
      
      inline def setDecodeValuesUndefined: Self = StObject.set(x, "decodeValues", js.undefined)
      
      inline def setMap(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
