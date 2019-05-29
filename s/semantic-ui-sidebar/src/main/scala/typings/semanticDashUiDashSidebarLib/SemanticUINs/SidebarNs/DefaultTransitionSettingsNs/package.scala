package typings
package semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DefaultTransitionSettingsNs {
  type ComputerSettings = semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.DefaultTransitionSettingsNs.ComputerSettingsNs.Param
  type MobileSettings = semanticDashUiDashSidebarLib.SemanticUINs.SidebarNs.DefaultTransitionSettingsNs.MobileSettingsNs.Param
  type Param = (stdLib.Pick[
    _Impl, 
    semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.computer | semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.mobile
  ]) with (stdLib.Partial[
    stdLib.Pick[
      _Impl, 
      semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.computer | semanticDashUiDashSidebarLib.semanticDashUiDashSidebarLibStrings.mobile
    ]
  ])
}
