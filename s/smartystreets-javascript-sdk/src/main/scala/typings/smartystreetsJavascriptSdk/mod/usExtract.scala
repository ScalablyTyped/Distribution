package typings.smartystreetsJavascriptSdk.mod

import typings.smartystreetsJavascriptSdk.anon.AddressCount
import typings.smartystreetsJavascriptSdk.anon.Addresses
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usExtract {
  
  @JSImport("smartystreets-javascript-sdk", "usExtract.Lookup")
  @js.native
  open class Lookup protected () extends StObject {
    def this(/**
      * The text with addresses to extract as the body of the request. Set the value of the Content-Type header to text/plain; charset=utf-8. Each request body is limited to a maximum length of
      * 64 kilobytes.
      */
    text: String) = this()
    
    /**
      * This parameter specifies if addresses in your input will ever have line breaks.
      * @default true
      */
    var addressesHaveLineBreaks: Boolean = js.native
    
    /**
      * Limits the extractor to a certain number of addresses per input line. Generally, you will not need this parameter unless you are submitting structured data that you know will only have a
      * certain number of addresses per line.
      * @default 0 - no limit
      */
    var addressesPerLine: Double = js.native
    
    /**
      * Aggressive mode may use more lookups on your account, but it can find addresses in populous cities without needing a state and [ZIP Code](https://smartystreets.com/docs/zip-codes-101) , as
      * well as finding addresses in some messy inputs.
      * @default true
      */
    var aggressive: Boolean = js.native
    
    /**
      * HTML input is automatically detected and stripped, but you can manually specify whether your input is formatted as HTML by setting this to true or false.
      */
    var html: Boolean = js.native
    
    var result: js.Array[Result] = js.native
    
    /**
      * The text with addresses to extract as the body of the request. Set the value of the Content-Type header to text/plain; charset=utf-8. Each request body is limited to a maximum length of 64
      * kilobytes.
      */
    var text: String = js.native
  }
  
  @JSImport("smartystreets-javascript-sdk", "usExtract.Result")
  @js.native
  open class Result protected () extends StObject {
    def this(x: Addresses) = this()
    
    var addressees: js.Array[Any] = js.native
    
    var meta: AddressCount = js.native
  }
}
