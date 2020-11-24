package typings.relayRuntime.readerNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReaderLinkedField extends ReaderField {
  
   // 'LinkedField';
  val alias: js.UndefOr[String | Null] = js.native
  
  val args: js.Array[ReaderArgument] = js.native
  
  val concreteType: js.UndefOr[String | Null] = js.native
  
  val kind: String = js.native
  
  val name: String = js.native
  
  val plural: Boolean = js.native
  
  val selections: js.Array[ReaderSelection] = js.native
  
  val storageKey: js.UndefOr[String | Null] = js.native
}
object ReaderLinkedField {
  
  @scala.inline
  def apply(
    args: js.Array[ReaderArgument],
    kind: String,
    name: String,
    plural: Boolean,
    selections: js.Array[ReaderSelection]
  ): ReaderLinkedField = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], plural = plural.asInstanceOf[js.Any], selections = selections.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReaderLinkedField]
  }
  
  @scala.inline
  implicit class ReaderLinkedFieldOps[Self <: ReaderLinkedField] (val x: Self) extends AnyVal {
    
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
    def setArgsVarargs(value: ReaderArgument*): Self = this.set("args", js.Array(value :_*))
    
    @scala.inline
    def setArgs(value: js.Array[ReaderArgument]): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlural(value: Boolean): Self = this.set("plural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionsVarargs(value: ReaderSelection*): Self = this.set("selections", js.Array(value :_*))
    
    @scala.inline
    def setSelections(value: js.Array[ReaderSelection]): Self = this.set("selections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlias(value: String): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAliasNull: Self = this.set("alias", null)
    
    @scala.inline
    def setConcreteType(value: String): Self = this.set("concreteType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcreteType: Self = this.set("concreteType", js.undefined)
    
    @scala.inline
    def setConcreteTypeNull: Self = this.set("concreteType", null)
    
    @scala.inline
    def setStorageKey(value: String): Self = this.set("storageKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStorageKey: Self = this.set("storageKey", js.undefined)
    
    @scala.inline
    def setStorageKeyNull: Self = this.set("storageKey", null)
  }
}
