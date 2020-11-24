package typings.stringifyObject.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /**
    * Expected to return a boolean of whether to include the property property of the object object in the output.
    */
  var filter: js.UndefOr[js.Function2[/* input */ js.Any, /* prop */ String | js.Symbol, Boolean]] = js.native
  
  /**
    * Preferred indentation
    * @default '\t'
    */
  var indent: js.UndefOr[String] = js.native
  
  /**
    * When set, will inline values up to inlineCharacterLimit length for the sake of more terse output.
    */
  var inlineCharacterLimit: js.UndefOr[Double] = js.native
  
  /**
    * Set to false to get double-quoted strings
    * @default true
    */
  var singleQuotes: js.UndefOr[Boolean] = js.native
  
  /**
    * Expected to return a string that transforms the string that resulted from stringifying object[property].
    * This can be used to detect special types of objects that need to be stringified in a particular way.
    * The transform function might return an alternate string in this case, otherwise returning the originalResult.
    */
  var transform: js.UndefOr[
    js.Function3[
      /* input */ js.Array[_] | js.Object, 
      /* prop */ Double | String | js.Symbol, 
      /* originalResult */ String, 
      String
    ]
  ] = js.native
}
object Filter {
  
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFilter(value: (/* input */ js.Any, /* prop */ String | js.Symbol) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setIndent(value: String): Self = this.set("indent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
    
    @scala.inline
    def setInlineCharacterLimit(value: Double): Self = this.set("inlineCharacterLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInlineCharacterLimit: Self = this.set("inlineCharacterLimit", js.undefined)
    
    @scala.inline
    def setSingleQuotes(value: Boolean): Self = this.set("singleQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSingleQuotes: Self = this.set("singleQuotes", js.undefined)
    
    @scala.inline
    def setTransform(
      value: (/* input */ js.Array[_] | js.Object, /* prop */ Double | String | js.Symbol, /* originalResult */ String) => String
    ): Self = this.set("transform", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}
