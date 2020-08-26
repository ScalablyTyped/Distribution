package typings.storybookAddonStoryshots

import typings.angularCore.mod.ComponentFactoryResolver
import typings.angularCore.mod.OnDestroy
import typings.angularCore.mod.OnInit
import typings.angularCore.mod.ViewContainerRef
import typings.storybookAddonStoryshots.typesMod.NgStory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@storybook/addon-storyshots/dist/frameworks/angular/app.component", JSImport.Namespace)
@js.native
object appComponentMod extends js.Object {
  @js.native
  class AppComponent protected ()
    extends OnInit
       with OnDestroy {
    def this(cfr: ComponentFactoryResolver, data: NgStory) = this()
    /**
      * Manually call 'ngOnChanges' hook because angular doesn't do that for dynamic components
      * Issue: [https://github.com/angular/angular/issues/8903]
      */
    var callNgOnChangesHook: js.Any = js.native
    var cfr: js.Any = js.native
    var data: js.Any = js.native
    var putInMyHtml: js.Any = js.native
    /**
      * If component implements ControlValueAccessor interface try to set ngModel
      */
    var setNgModel: js.Any = js.native
    /**
      * Set inputs and outputs
      */
    var setProps: js.Any = js.native
    var target: ViewContainerRef = js.native
  }
  
}

