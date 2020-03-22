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
    /**
      * A callback method that performs custom clean-up, invoked immediately
      * before a directive, pipe, or service instance is destroyed.
      */
    /* CompleteClass */
    override def ngOnDestroy(): Unit = js.native
    /**
      * A callback method that is invoked immediately after the
      * default change detector has checked the directive's
      * data-bound properties for the first time,
      * and before any of the view or content children have been checked.
      * It is invoked only once when the directive is instantiated.
      */
    /* CompleteClass */
    override def ngOnInit(): Unit = js.native
  }
  
}

