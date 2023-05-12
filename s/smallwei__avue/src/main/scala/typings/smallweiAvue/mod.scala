package typings.smallweiAvue

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typings.smallweiAvue.anon.Capsule
import typings.smallweiAvue.anon.Excel
import typings.smallweiAvue.anon.Props
import typings.smallweiAvue.anon.PropsAvueSelectProps
import typings.smallweiAvue.anon.PropsSlots
import typings.smallweiAvue.anon.Slots
import typings.smallweiAvue.anon.TextString
import typings.smallweiAvue.anon.ThumbUrl
import typings.smallweiAvue.crudMod.AvueCrudProps
import typings.smallweiAvue.crudMod.AvueCrudSlots
import typings.smallweiAvue.formMod.AvueFormProps
import typings.smallweiAvue.formMod.AvueFormSlots
import typings.smallweiAvue.selectMod.AvueSelectProps
import typings.smallweiAvue.smallweiAvueStrings.dark
import typings.smallweiAvue.treeMod.AvueTreeProps
import typings.smallweiAvue.treeMod.AvueTreeSlots
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@smallwei/avue", JSImport.Default)
  @js.native
  val default: AvueInstall = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue", "AvueCrud")
  @js.native
  open class AvueCrud ()
    extends StObject
       with Props {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueCrudProps[Any] = js.native
    
    /* CompleteClass */
    @JSName("$slots")
    var $slots: AvueCrudSlots[Any] = js.native
  }
  @JSImport("@smallwei/avue", "AvueCrud")
  @js.native
  val AvueCrud: Instantiable0[Props] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue", "AvueForm")
  @js.native
  open class AvueForm ()
    extends StObject
       with Slots {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueFormProps[Any] = js.native
    
    /* CompleteClass */
    @JSName("$slots")
    var $slots: AvueFormSlots[Any] = js.native
  }
  @JSImport("@smallwei/avue", "AvueForm")
  @js.native
  val AvueForm: Instantiable0[Slots] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue", "AvueSelect")
  @js.native
  open class AvueSelect ()
    extends StObject
       with PropsAvueSelectProps {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueSelectProps[Any] = js.native
  }
  @JSImport("@smallwei/avue", "AvueSelect")
  @js.native
  val AvueSelect: Instantiable0[PropsAvueSelectProps] = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@smallwei/avue", "AvueTree")
  @js.native
  open class AvueTree ()
    extends StObject
       with PropsSlots {
    
    /* CompleteClass */
    @JSName("$props")
    var $props: AvueTreeProps[Any] = js.native
    
    /* CompleteClass */
    @JSName("$slots")
    var $slots: AvueTreeSlots[Any] = js.native
  }
  @JSImport("@smallwei/avue", "AvueTree")
  @js.native
  val AvueTree: Instantiable0[PropsSlots] = js.native
  
  trait AvueConfig extends StObject {
    
    var axios: js.UndefOr[Any] = js.undefined
    
    var menuType: js.UndefOr[MenuType] = js.undefined
    
    var size: js.UndefOr[Size] = js.undefined
    
    var theme: js.UndefOr[dark] = js.undefined
  }
  object AvueConfig {
    
    inline def apply(): AvueConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvueConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvueConfig] (val x: Self) extends AnyVal {
      
      inline def setAxios(value: Any): Self = StObject.set(x, "axios", value.asInstanceOf[js.Any])
      
      inline def setAxiosUndefined: Self = StObject.set(x, "axios", js.undefined)
      
      inline def setMenuType(value: MenuType): Self = StObject.set(x, "menuType", value.asInstanceOf[js.Any])
      
      inline def setMenuTypeUndefined: Self = StObject.set(x, "menuType", js.undefined)
      
      inline def setSize(value: Size): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTheme(value: dark): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  @js.native
  trait AvueInstall extends StObject {
    
    def install(app: Any): Unit = js.native
    def install(app: Any, config: AvueConfig): Unit = js.native
  }
  
  type _To = AvueInstall
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: AvueInstall = default
  
  /* augmented module */
  object vueAugmentingMod {
    
    @js.native
    trait ComponentCustomProperties extends StObject {
      
      @JSName("$Clipboard")
      def $Clipboard(arg: TextString): js.Promise[Unit] = js.native
      
      @JSName("$Export")
      var $Export: Excel = js.native
      
      @JSName("$ImagePreview")
      def $ImagePreview(list: js.Array[ThumbUrl]): Unit = js.native
      @JSName("$ImagePreview")
      def $ImagePreview(list: js.Array[ThumbUrl], index: Double): Unit = js.native
      
      @JSName("$Log")
      var $Log: Capsule = js.native
      
      @JSName("$Print")
      def $Print(selector: String): Unit = js.native
      @JSName("$Print")
      def $Print(selector: HTMLElement): Unit = js.native
    }
    
    trait GlobalComponents extends StObject {
      
      var AvueCrud: Instantiable0[Props]
      
      var AvueForm: Instantiable0[Slots]
      
      var AvueTree: Instantiable0[PropsSlots]
    }
    object GlobalComponents {
      
      inline def apply(
        AvueCrud: Instantiable0[Props],
        AvueForm: Instantiable0[Slots],
        AvueTree: Instantiable0[PropsSlots]
      ): GlobalComponents = {
        val __obj = js.Dynamic.literal(AvueCrud = AvueCrud.asInstanceOf[js.Any], AvueForm = AvueForm.asInstanceOf[js.Any], AvueTree = AvueTree.asInstanceOf[js.Any])
        __obj.asInstanceOf[GlobalComponents]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: GlobalComponents] (val x: Self) extends AnyVal {
        
        inline def setAvueCrud(value: Instantiable0[Props]): Self = StObject.set(x, "AvueCrud", value.asInstanceOf[js.Any])
        
        inline def setAvueForm(value: Instantiable0[Slots]): Self = StObject.set(x, "AvueForm", value.asInstanceOf[js.Any])
        
        inline def setAvueTree(value: Instantiable0[PropsSlots]): Self = StObject.set(x, "AvueTree", value.asInstanceOf[js.Any])
      }
    }
  }
}
