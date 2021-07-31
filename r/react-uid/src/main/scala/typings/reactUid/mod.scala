package typings.reactUid

import typings.react.mod.SFC
import typings.reactUid.contextMod.UIDProps
import typings.reactUid.controlMod.WithPrefix
import typings.reactUid.hooksMod.SeedGenerator
import typings.reactUid.uidcomponentMod.UID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-uid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-uid", "UIDConsumer")
  @js.native
  val UIDConsumer: SFC[UIDProps] = js.native
  
  @JSImport("react-uid", "UIDFork")
  @js.native
  val UIDFork: SFC[WithPrefix] = js.native
  
  @JSImport("react-uid", "UIDReset")
  @js.native
  val UIDReset: SFC[WithPrefix] = js.native
  
  @JSImport("react-uid", "UID")
  @js.native
  class UID_ protected () extends UID {
    def this(props: UIDProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: UIDProps, context: js.Any) = this()
  }
  
  @scala.inline
  def generateUID(): js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateUID")().asInstanceOf[js.Function2[/* item */ js.Any, /* index */ js.UndefOr[Double], String]]
  
  @scala.inline
  def uid(item: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def uid(item: js.Any, index: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("uid")(item.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def useUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useUID")().asInstanceOf[String]
  
  @scala.inline
  def useUIDSeed(): SeedGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useUIDSeed")().asInstanceOf[SeedGenerator]
}
