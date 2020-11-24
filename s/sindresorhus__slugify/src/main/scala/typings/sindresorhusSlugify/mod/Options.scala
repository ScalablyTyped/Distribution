package typings.sindresorhusSlugify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Add your own custom replacements.
  		The replacements are run on the original string before any other transformations.
  		This only overrides a default replacement if you set an item with the same key, like `&`.
  		Add a leading and trailing space to the replacement to have it separated by dashes.
  		@default [ ['&', ' and '], ['🦄', ' unicorn '], ['♥', ' love '] ]
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('Foo@unicorn', {
  			customReplacements: [
  				['@', 'at']
  			]
  		});
  		//=> 'fooatunicorn'
  		slugify('foo@unicorn', {
  			customReplacements: [
  				['@', ' at ']
  			]
  		});
  		//=> 'foo-at-unicorn'
  		slugify('I love 🐶', {
  			customReplacements: [
  				['🐶', 'dogs']
  			]
  		});
  		//=> 'i-love-dogs'
  		```
  		*/
  val customReplacements: js.UndefOr[js.Array[js.Tuple2[String, String]]] = js.native
  
  /**
  		Convert camelcase to separate words. Internally it does `fooBar` → `foo bar`.
  		@default true
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('fooBar');
  		//=> 'foo-bar'
  		slugify('fooBar', {decamelize: false});
  		//=> 'foobar'
  		```
  		*/
  val decamelize: js.UndefOr[Boolean] = js.native
  
  /**
  		Make the slug lowercase.
  		@default true
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('Déjà Vu!');
  		//=> 'deja-vu'
  		slugify('Déjà Vu!', {lowercase: false});
  		//=> 'Deja-Vu'
  		```
  		*/
  val lowercase: js.UndefOr[Boolean] = js.native
  
  /**
  		If your string starts with an underscore, it will be preserved in the slugified string.
  		Sometimes leading underscores are intentional, for example, filenames representing hidden paths on a website.
  		@default false
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('_foo_bar');
  		//=> 'foo-bar'
  		slugify('_foo_bar', {preserveLeadingUnderscore: true});
  		//=> '_foo-bar'
  		```
  		*/
  val preserveLeadingUnderscore: js.UndefOr[Boolean] = js.native
  
  /**
  		@default '-'
  		@example
  		```
  		import slugify = require('@sindresorhus/slugify');
  		slugify('BAR and baz');
  		//=> 'bar-and-baz'
  		slugify('BAR and baz', {separator: '_'});
  		//=> 'bar_and_baz'
  		slugify('BAR and baz', {separator: ''});
  		//=> 'barandbaz'
  		```
  		*/
  val separator: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCustomReplacementsVarargs(value: (js.Tuple2[String, String])*): Self = this.set("customReplacements", js.Array(value :_*))
    
    @scala.inline
    def setCustomReplacements(value: js.Array[js.Tuple2[String, String]]): Self = this.set("customReplacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomReplacements: Self = this.set("customReplacements", js.undefined)
    
    @scala.inline
    def setDecamelize(value: Boolean): Self = this.set("decamelize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecamelize: Self = this.set("decamelize", js.undefined)
    
    @scala.inline
    def setLowercase(value: Boolean): Self = this.set("lowercase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLowercase: Self = this.set("lowercase", js.undefined)
    
    @scala.inline
    def setPreserveLeadingUnderscore(value: Boolean): Self = this.set("preserveLeadingUnderscore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveLeadingUnderscore: Self = this.set("preserveLeadingUnderscore", js.undefined)
    
    @scala.inline
    def setSeparator(value: String): Self = this.set("separator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeparator: Self = this.set("separator", js.undefined)
  }
}
