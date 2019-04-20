package typings
package reactDashGithubDashButtonLib.reactDashGithubDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactGitHubButtonProps extends js.Object {
  /**
    * Your GitHub id or organization name.
    */
  var namespace: java.lang.String
  /**
    * The name of your repository.
    */
  var repo: java.lang.String
  /**
    * The size of the button. Leave undefined for default.
    */
  var size: js.UndefOr[reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.large] = js.undefined
  /**
    * The type of information to display
    */
  var `type`: reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.stargazers | reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.watchers | reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.forks
}

object ReactGitHubButtonProps {
  @scala.inline
  def apply(
    namespace: java.lang.String,
    repo: java.lang.String,
    `type`: reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.stargazers | reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.watchers | reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.forks,
    size: reactDashGithubDashButtonLib.reactDashGithubDashButtonLibStrings.large = null
  ): ReactGitHubButtonProps = {
    val __obj = js.Dynamic.literal(namespace = namespace, repo = repo)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[ReactGitHubButtonProps]
  }
}

