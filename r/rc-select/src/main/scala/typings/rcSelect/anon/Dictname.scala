package typings.rcSelect.anon

import org.scalablytyped.runtime.StringDictionary
import typings.rcSelect.generatorMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dictname[OptionsType /* <: js.Array[js.Object] */]
  extends StObject
     with /** Save for customize data */
/* prop */ StringDictionary[js.Any] {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
  
  var key: Key
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
  implicit class DictnameMutableBuilder[Self <: Dictname[?], OptionsType /* <: js.Array[js.Object] */] (val x: Self & Dictname[OptionsType]) extends AnyVal {
    
    @scala.inline
    def setData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: OptionsType[number] */ js.Any
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
