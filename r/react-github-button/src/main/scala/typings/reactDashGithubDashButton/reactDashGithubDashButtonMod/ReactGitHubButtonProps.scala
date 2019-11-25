package typings.reactDashGithubDashButton.reactDashGithubDashButtonMod

import typings.reactDashGithubDashButton.reactDashGithubDashButtonStrings.forks
import typings.reactDashGithubDashButton.reactDashGithubDashButtonStrings.large
import typings.reactDashGithubDashButton.reactDashGithubDashButtonStrings.stargazers
import typings.reactDashGithubDashButton.reactDashGithubDashButtonStrings.watchers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactGitHubButtonProps extends js.Object {
  /**
    * Your GitHub id or organization name.
    */
  var namespace: String
  /**
    * The name of your repository.
    */
  var repo: String
  /**
    * The size of the button. Leave undefined for default.
    */
  var size: js.UndefOr[large] = js.undefined
  /**
    * The type of information to display
    */
  var `type`: stargazers | watchers | forks
}

object ReactGitHubButtonProps {
  @scala.inline
  def apply(namespace: String, repo: String, `type`: stargazers | watchers | forks, size: large = null): ReactGitHubButtonProps = {
    val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactGitHubButtonProps]
  }
}

