package typings.simpleDiff.mod

import org.scalablytyped.runtime.StringDictionary
import typings.simpleDiff.anon.NewPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var addEvent: js.UndefOr[String] = js.native
  
  var addItemEvent: js.UndefOr[String] = js.native
  
  var callback: js.UndefOr[js.Function1[/* event */ Event, Unit]] = js.native
  
  var changeEvent: js.UndefOr[String] = js.native
  
  var comparators: js.UndefOr[
    js.Array[
      js.Tuple2[
        _, 
        js.Function3[/* oldValue */ _, /* newValue */ _, /* options */ NewPath, Boolean]
      ]
    ]
  ] = js.native
  
  var idProp: js.UndefOr[String] = js.native
  
  var idProps: js.UndefOr[StringDictionary[String]] = js.native
  
  var ignore: js.UndefOr[
    js.Function3[/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath, Boolean]
  ] = js.native
  
  var moveItemEvent: js.UndefOr[String] = js.native
  
  var removeEvent: js.UndefOr[String] = js.native
  
  var removeItemEvent: js.UndefOr[String] = js.native
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
    def setAddEvent(value: String): Self = this.set("addEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddEvent: Self = this.set("addEvent", js.undefined)
    
    @scala.inline
    def setAddItemEvent(value: String): Self = this.set("addItemEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddItemEvent: Self = this.set("addItemEvent", js.undefined)
    
    @scala.inline
    def setCallback(value: /* event */ Event => Unit): Self = this.set("callback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setChangeEvent(value: String): Self = this.set("changeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChangeEvent: Self = this.set("changeEvent", js.undefined)
    
    @scala.inline
    def setComparatorsVarargs(value: (js.Tuple2[js.Any, js.Function3[js.Any, js.Any, /* options */ NewPath, Boolean]])*): Self = this.set("comparators", js.Array(value :_*))
    
    @scala.inline
    def setComparators(
      value: js.Array[
          js.Tuple2[
            _, 
            js.Function3[/* oldValue */ _, /* newValue */ _, /* options */ NewPath, Boolean]
          ]
        ]
    ): Self = this.set("comparators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComparators: Self = this.set("comparators", js.undefined)
    
    @scala.inline
    def setIdProp(value: String): Self = this.set("idProp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdProp: Self = this.set("idProp", js.undefined)
    
    @scala.inline
    def setIdProps(value: StringDictionary[String]): Self = this.set("idProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdProps: Self = this.set("idProps", js.undefined)
    
    @scala.inline
    def setIgnore(value: (/* oldValue */ js.Any, /* newValue */ js.Any, /* options */ NewPath) => Boolean): Self = this.set("ignore", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    
    @scala.inline
    def setMoveItemEvent(value: String): Self = this.set("moveItemEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMoveItemEvent: Self = this.set("moveItemEvent", js.undefined)
    
    @scala.inline
    def setRemoveEvent(value: String): Self = this.set("removeEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveEvent: Self = this.set("removeEvent", js.undefined)
    
    @scala.inline
    def setRemoveItemEvent(value: String): Self = this.set("removeItemEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveItemEvent: Self = this.set("removeItemEvent", js.undefined)
  }
}
