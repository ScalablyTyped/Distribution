package typings.reactMdForm

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.reactMdList.getListItemHeightMod.SimpleListItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("@react-md/form/types/select/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def defaultIsOptionDisabled(option: ListboxOption): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultIsOptionDisabled")(option.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def getDisplayLabel(option: ListboxOption, labelKey: String, includeLeft: Boolean): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getDisplayLabel")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any], includeLeft.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  @scala.inline
  def getOptionId(baseId: String, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptionId")(baseId.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def getOptionLabel(option: ListboxOption, labelKey: String): ReactNode = (^.asInstanceOf[js.Dynamic].applyDynamic("getOptionLabel")(option.asInstanceOf[js.Any], labelKey.asInstanceOf[js.Any])).asInstanceOf[ReactNode]
  
  @scala.inline
  def isListboxOptionProps(option: ListboxOption): /* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isListboxOptionProps")(option.asInstanceOf[js.Any]).asInstanceOf[/* is @react-md/form.@react-md/form/types/select/utils.ListboxOptionProps */ Boolean]
  
  type ListboxOption = ListboxOptionProps | String | Double | Null
  
  trait ListboxOptionProps
    extends StObject
       with SimpleListItemProps
       with /* labelKey */ StringDictionary[ReactNode]
  object ListboxOptionProps {
    
    @scala.inline
    def apply(): ListboxOptionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListboxOptionProps]
    }
  }
}
