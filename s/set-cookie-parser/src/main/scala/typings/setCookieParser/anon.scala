package typings.setCookieParser

import typings.setCookieParser.setCookieParserBooleans.`false`
import typings.setCookieParser.setCookieParserBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined set-cookie-parser.set-cookie-parser.Options & {  map :false | undefined} */
  @js.native
  trait Optionsmapfalseundefined extends StObject {
    
    /**
      * Calls dcodeURIComponent on each value
      * @default true
      */
    var decodeValues: js.UndefOr[Boolean] = js.native
    
    /**
      * Return an object instead of an array
      * @default false
      */
    var map: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
    
    /**
      * Suppress the warning that is loged when called on a request instead of a response
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.native
  }
  object Optionsmapfalseundefined {
    
    @scala.inline
    def apply(map: js.UndefOr[Boolean] with js.UndefOr[`false`]): Optionsmapfalseundefined = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsmapfalseundefined]
    }
    
    @scala.inline
    implicit class OptionsmapfalseundefinedMutableBuilder[Self <: Optionsmapfalseundefined] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeValues(value: Boolean): Self = StObject.set(x, "decodeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeValuesUndefined: Self = StObject.set(x, "decodeValues", js.undefined)
      
      @scala.inline
      def setMap(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
  
  /* Inlined set-cookie-parser.set-cookie-parser.Options & {  map :true} */
  @js.native
  trait Optionsmaptrue extends StObject {
    
    /**
      * Calls dcodeURIComponent on each value
      * @default true
      */
    var decodeValues: js.UndefOr[Boolean] = js.native
    
    /**
      * Return an object instead of an array
      * @default false
      */
    var map: js.UndefOr[Boolean] with `true` = js.native
    
    /**
      * Suppress the warning that is loged when called on a request instead of a response
      * @default false
      */
    var silent: js.UndefOr[Boolean] = js.native
  }
  object Optionsmaptrue {
    
    @scala.inline
    def apply(map: js.UndefOr[Boolean] with `true`): Optionsmaptrue = {
      val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsmaptrue]
    }
    
    @scala.inline
    implicit class OptionsmaptrueMutableBuilder[Self <: Optionsmaptrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDecodeValues(value: Boolean): Self = StObject.set(x, "decodeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeValuesUndefined: Self = StObject.set(x, "decodeValues", js.undefined)
      
      @scala.inline
      def setMap(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    }
  }
}
