package typings.storybookApi.anon

import typings.std.Record
import typings.storybookApi.distTs3Dot9LibStoriesMod.StoriesHash
import typings.storybookApi.distTs3Dot9ModulesLayoutMod.Layout
import typings.storybookApi.distTs3Dot9ModulesLayoutMod.UI
import typings.storybookApi.distTs3Dot9ModulesNotificationsMod.Notification
import typings.storybookApi.distTs3Dot9ModulesRefsMod.ComposedRef
import typings.storybookApi.distTs3Dot9ModulesSettingsMod.Settings
import typings.storybookApi.distTs3Dot9ModulesShortcutsMod.Shortcuts
import typings.storybookApi.distTs3Dot9ModulesUrlMod.QueryParams
import typings.storybookApi.distTs3Dot9ModulesVersionsMod.UnknownEntries
import typings.storybookApi.distTs3Dot9ModulesVersionsMod.Versions
import typings.storybookTheming.mod.ThemeVars
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomQueryParams extends StObject {
  
  var customQueryParams: QueryParams = js.native
  
  var dismissedVersionNotification: String = js.native
  
  var globalTypes: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.GlobalTypes */ Any
  ] = js.native
  
  var globals: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_csf.Globals */ Any
  ] = js.native
  
  var lastVersionCheck: Double = js.native
  
  var layout: Layout = js.native
  
  var location: PartialLocation = js.native
  
  def navigate(to: String): Unit = js.native
  def navigate(to: String, hasPlainOptions: Any): Unit = js.native
  def navigate(to: Double): Unit = js.native
  def navigate(to: Double, hasPlainOptions: Any): Unit = js.native
  
  var notifications: js.Array[Notification] = js.native
  
  var path: String = js.native
  
  var refId: String = js.native
  
  var refs: Record[String, ComposedRef] = js.native
  
  var releaseNotesViewed: js.Array[String] = js.native
  
  var selectedPanel: String = js.native
  
  var settings: Settings = js.native
  
  var shortcuts: Shortcuts = js.native
  
  var singleStory: js.UndefOr[Boolean] = js.native
  
  var storiesConfigured: Boolean = js.native
  
  var storiesFailed: js.UndefOr[js.Error] = js.native
  
  var storiesHash: StoriesHash = js.native
  
  var storyId: String = js.native
  
  var theme: ThemeVars = js.native
  
  var ui: UI = js.native
  
  var versions: Versions & UnknownEntries = js.native
  
  var viewMode: String = js.native
}
