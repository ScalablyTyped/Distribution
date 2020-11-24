package typings.reactNativeJoi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Extension extends js.Object {
  
  var base: js.UndefOr[Schema] = js.native
  
  var coerce: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
  
  var describe: js.UndefOr[
    js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]
  ] = js.native
  
  var language: js.UndefOr[LanguageOptions] = js.native
  
  var name: String = js.native
  
  var pre: js.UndefOr[
    js.ThisFunction3[
      /* this */ ExtensionBoundSchema, 
      /* value */ js.Any, 
      /* state */ State, 
      /* options */ ValidationOptions, 
      _
    ]
  ] = js.native
  
  var rules: js.UndefOr[js.Array[Rules[_]]] = js.native
}
object Extension {
  
  @scala.inline
  def apply(name: String): Extension = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extension]
  }
  
  @scala.inline
  implicit class ExtensionOps[Self <: Extension] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBase(value: Schema): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setCoerce(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = this.set("coerce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoerce: Self = this.set("coerce", js.undefined)
    
    @scala.inline
    def setDescribe(value: js.ThisFunction1[/* this */ Schema, /* description */ Description_, Description_]): Self = this.set("describe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescribe: Self = this.set("describe", js.undefined)
    
    @scala.inline
    def setLanguage(value: LanguageOptions): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLanguage: Self = this.set("language", js.undefined)
    
    @scala.inline
    def setLanguageNull: Self = this.set("language", null)
    
    @scala.inline
    def setPre(
      value: js.ThisFunction3[
          /* this */ ExtensionBoundSchema, 
          /* value */ js.Any, 
          /* state */ State, 
          /* options */ ValidationOptions, 
          _
        ]
    ): Self = this.set("pre", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePre: Self = this.set("pre", js.undefined)
    
    @scala.inline
    def setRulesVarargs(value: Rules[js.Any]*): Self = this.set("rules", js.Array(value :_*))
    
    @scala.inline
    def setRules(value: js.Array[Rules[_]]): Self = this.set("rules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRules: Self = this.set("rules", js.undefined)
  }
}
