package typings.rcSelect.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rcSelect.generatorMod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Dictname[OptionsType /* <: js.Array[js.Object] */]
  extends /** Save for customize data */
/* prop */ StringDictionary[js.Any] {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any = js.native
  
  var key: Key = js.native
}
object Dictname {
  
  @scala.inline
  def apply[OptionsType /* <: js.Array[js.Object] */](
    data: /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any,
    key: Key
  ): Dictname[OptionsType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dictname[OptionsType]]
  }
  
  @scala.inline
  implicit class DictnameOps[Self <: Dictname[_], OptionsType /* <: js.Array[js.Object] */] (val x: Self with Dictname[OptionsType]) extends AnyVal {
    
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
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
    ): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
  }
}
