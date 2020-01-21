package typings.sailthruClient.mod

import typings.sailthruClient.AnonLimit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SailthruClient extends js.Object {
  var logging: Boolean = js.native
  /**
    * Perform an arbitrary API DELETE request to Sailthru.
    * @param action the API endpoint to send a request to
    * @param data provide the API options, as outlined in the DELETE section of the documentation for that endpoint
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def apiDelete(action: String, data: js.Object): Unit = js.native
  def apiDelete(action: String, data: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Perform an arbitrary API GET request to Sailthru.
    * @param action the API endpoint to send a request to
    * @param data provide the API options, as outlined in the GET section of the documentation for that endpoint
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def apiGet(action: String, data: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Perform an arbitrary API POST request to Sailthru.
    * @param action the API endpoint to send a request to
    * @param data provide the API options, as outlined in the POST section of the documentation for that endpoint
    * @param binary_data_params used to specify file upload details. Should be an array which includes strings, corresponding to fields in the “options” parameter that should be read in as files
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def apiPost(action: String, data: js.Object, binary_data_params: js.Array[String], callback: SailthruCallback): Unit | RestlerResult = js.native
  /**
    * Perform an arbitrary API POST request to Sailthru.
    * @param action the API endpoint to send a request to
    * @param data provide the API options, as outlined in the POST section of the documentation for that endpoint
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def apiPost(action: String, data: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Perform multipart API POST request to Sailthru
    * @param action the API endpoint to send a request to
    * @param data provide the API options, as outlined in the POST section of the documentation for that endpoint
    * @param binary_data_params used to specify file upload details. Should be an array which includes strings, corresponding to fields in the “options” parameter that should be read in as files
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def apiPostMultiPart(action: String, data: js.Object, binary_data_param: js.Array[String], callback: SailthruCallback): RestlerResult = js.native
  /**
    * Cancel a campaign which is currently sending, by blast ID. This cannot be undone.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def cancelBlast(blastId: String, callback: SailthruCallback): Unit = js.native
  def cancelBlast(blastId: Double, callback: SailthruCallback): Unit = js.native
  /**
    * Cancels the scheduled send which is identified by “send_id”. Note that you can only cancel sends which were scheduled in the future with the “schedule_time” parameters.
    * @param send_id the send ID which was in the response of a previous send call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def cancelSend(send_id: String, callback: SailthruCallback): Unit = js.native
  /**
    * Delete a previously created campaign, by blast ID. This cannot be undone.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def deleteBlast(blastId: String, callback: SailthruCallback): Unit = js.native
  def deleteBlast(blastId: Double, callback: SailthruCallback): Unit = js.native
  /**
    * Delete a list from your account, and remove all record of it from your user profiles. This cannot be undone.
    * @param list the name of an existing list in your account
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def deleteList(list: String, callback: SailthruCallback): Unit = js.native
  /**
    * Delete a template from your account. This cannot be undone.
    * @param template the name of the template
    * @param callbacka standard callback function which will be invoked after the API server responds
    */
  def deleteTemplate(template: String, callback: SailthruCallback): Unit = js.native
  /**
    * Disable Logging
    */
  def disableLogging(): Unit = js.native
  /**
    * Enable Logging
    */
  def enableLogging(): Unit = js.native
  /**
    * Looks up the details about a particular campaign, using blast ID.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def getBlast(blastId: String, callback: SailthruCallback): Unit = js.native
  def getBlast(blastId: Double, callback: SailthruCallback): Unit = js.native
  /**
    * Fetch the status of a job
    * @param job the job ID which was returned from a previous job POST
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def getJobStatus(job: String, callback: SailthruCallback): Unit = js.native
  /**
    * Retrieve the last known rate limit information for the given action / method combination
    * @param action API action to get rate limit information
    * @param method API method to get rate limit information
    */
  def getLastRateLimitInfo(action: String, method: String): AnonLimit = js.native
  /**
    * Return a list of all the lists in your account.
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def getLists(callback: SailthruCallback): Unit = js.native
  /**
    * Looks up the delivery status of a particular send, by its “send_id”.
    * @param send_id the send ID which was in the response of a previous send call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def getSend(send_id: String, callback: SailthruCallback): Unit = js.native
  /**
    * Return a user profile by looking up via a given key and ID.
    * @param id the id for a given user
    * @param key specify which type of key was provided in the “id” parameter
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def getUserByKey(id: String, key: String, callback: SailthruCallback): Unit = js.native
  /**
    * Return a user profile by looking up via a given key and ID.
    * @param id the id for a given user
    * @param key specify which type of key was provided in the “id” parameter
    * @param fields specify which fields to return. Options are documented here https://getstarted.sailthru.com/new-for-developers-overview/email-and-user-profiles/user/#fieldstype
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def getUserByKey(id: String, key: String, fields: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Return a user profile by looking up via a Sailthru ID (sid).
    * @param sid the sailthru id for a given user
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def getUserBySid(sid: String, callback: SailthruCallback): Unit = js.native
  /**
    * Send a message to each of the “emails” specified, using the given “template”.
    * @param template Name of the template to use as the basis for the message content
    * @param emails valid email addresses to send the message to. This can be either a comma-separated String, or a Javascript Array.
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def multiSend(template: String, emails: String, callback: SailthruCallback): Unit = js.native
  def multiSend(template: String, emails: js.Array[String], callback: SailthruCallback): Unit = js.native
  /**
    * Send a message to each of the “emails” specified, using the given “template”.
    * @param template Name of the template to use as the basis for the message content
    * @param emails valid email addresses to send the message to. This can be either a comma-separated String, or a Javascript Array.
    * @param options a Javascript object that can be used to specify any other valid API parameters for the send POST,
    * the full list is available https://getstarted.sailthru.com/new-for-developers-overview/email-and-user-profiles/send/
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def multiSend(template: String, emails: js.Array[String], options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Pause a currently sending created campaign, by blast ID.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def pauseBlast(blastId: String, callback: SailthruCallback): Unit = js.native
  def pauseBlast(blastId: Double, callback: SailthruCallback): Unit = js.native
  /**
    * Create a new job with specific options.
    * @param job the name of the job to create
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def processJob(job: String, callback: SailthruCallback): Unit = js.native
  /**
    * Create a new job with specific options.
    * @param job the name of the job to create
    * @param options provide additional job API options, as outlined in the job POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def processJob(job: String, options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Create a new job with specific options.
    * @param job the name of the job to create
    * @param options provide additional job API options, as outlined in the job POST documentation
    * @param report_email the email address that will be emailed when the job completes or fails
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def processJob(job: String, options: js.Object, report_email: String, callback: SailthruCallback): Unit = js.native
  /**
    * Create a new job with specific options.
    * @param job the name of the job to create
    * @param options provide additional job API options, as outlined in the job POST documentation
    * @param report_email the email address that will be emailed when the job completes or fails
    * @param postback_url the URL which will receive postback data when the job completes or fails
    * @param binary_data_params used to specify file upload details. Should be an array which includes strings, corresponding to fields in the “options” parameter that should be read in as files.
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def processJob(
    job: String,
    options: js.Object,
    report_email: String,
    postback_url: String,
    binary_data_params: js.Array[String],
    callback: SailthruCallback
  ): Unit = js.native
  /**
    * Create a new job with specific options.
    * @param job the name of the job to create
    * @param options provide additional job API options, as outlined in the job POST documentation
    * @param report_email the email address that will be emailed when the job completes or fails
    * @param postback_url the URL which will receive postback data when the job completes or fails
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def processJob(
    job: String,
    options: js.Object,
    report_email: String,
    postback_url: String,
    callback: SailthruCallback
  ): Unit = js.native
  /**
    * Record a purchase into the Sailthru system.
    * @param email the email of the user who made the purchase
    * @param items a description of what items the user purchased. See the examples on the main Purchase API page
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def purchase(email: String, items: js.Array[PurchaseItem], callback: SailthruCallback): Unit = js.native
  /**
    * Record a purchase into the Sailthru system.
    * @param email the email of the user who made the purchase
    * @param items a description of what items the user purchased. See the examples on the main Purchase API page
    * @param options provide additional purchase API options, as outlined in the purchase POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def purchase(email: String, items: js.Array[PurchaseItem], options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Create a new content item.
    * @param title the name of the content item being created
    * @param url the URL of the content item, which will be used as its unique identifier
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def pushContent(title: String, url: String, callback: SailthruCallback): Unit = js.native
  /**
    * Create a new content item.
    * @param title the name of the content item being created
    * @param url the URL of the content item, which will be used as its unique identifier
    * @param options provide additional content API options, as outlined in the content POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def pushContent(title: String, url: String, options: js.Object, callback: SailthruCallback): Unit = js.native
  def receiveOptoutPost(): Unit = js.native
  /**
    * Resume a previously paused campaign, by blast ID.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def resumeBlast(blastId: String, callback: SailthruCallback): Unit = js.native
  def resumeBlast(blastId: Double, callback: SailthruCallback): Unit = js.native
  /**
    * Create or update a template with the given name
    * @param template the name of the template
    * @param options any template API options, as outlined in the template POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def saveTemplate(template: String, options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Revert a template to one of its previous revisions.
    * @param template the name of the template
    * @param revision_id a revision_id of the template
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def saveTemplateFromRevision(template: String, revision_id: String, callback: SailthruCallback): Unit = js.native
  /**
    * Update a user profile.
    * @param id the id for a given user
    * @param key specify which type of key was provided in the “id” parameter
    * @param options provide user API options, as outlined in the user POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def saveUserByKey(id: String, key: String, options: js.Object, callback: SailthruCallback): Unit | RestlerResult = js.native
  /**
    * Update a user profile.
    * @param sid the sailthru id for a given user
    * @param options provide user API options, as outlined in the user POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def saveUserBySid(sid: String, options: js.Object, callback: SailthruCallback): Unit | RestlerResult = js.native
  /**
    * Schedule a new campaign.
    * @param name the name for the campaign, which will be used to identify it in Campaign Reporting
    * @param list the target list for the campaign
    * @param scheduleTime when the campaign should be sent
    * @param fromName the from name for the email campaign
    * @param fromEmail the from email for the email campaign
    * @param subject the email subject line for the campaign
    * @param contentHtml the content of the email body, for the HTML version of the campaign
    * @param contentText the content of the email body, for the Text version of the campaign
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def scheduleBlast(
    name: String,
    list: String,
    scheduleTime: String,
    fromName: String,
    fromEmail: String,
    subject: String,
    contentHtml: String,
    contentText: String,
    callback: SailthruCallback
  ): Unit = js.native
  /**
    * Schedule a new campaign.
    * @param name the name for the campaign, which will be used to identify it in Campaign Reporting
    * @param list the target list for the campaign
    * @param scheduleTime when the campaign should be sent
    * @param fromName the from name for the email campaign
    * @param fromEmail the from email for the email campaign
    * @param subject the email subject line for the campaign
    * @param contentHtml the content of the email body, for the HTML version of the campaign
    * @param contentText the content of the email body, for the Text version of the campaign
    * @param options provide additional blast API options, as outlined in the blast POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def scheduleBlast(
    name: String,
    list: String,
    scheduleTime: String,
    fromName: String,
    fromEmail: String,
    subject: String,
    contentHtml: String,
    contentText: String,
    options: js.Object,
    callback: SailthruCallback
  ): Unit = js.native
  /**
    * Modify an existing campaign by setting any field.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param scheduleTime when the campaign should be sent
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def scheduleBlastFromBlast(blastId: String, scheduleTime: String, callback: SailthruCallback): Unit = js.native
  /**
    * Modify an existing campaign by setting any field.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param scheduleTime when the campaign should be sent
    * @param options provide additional blast API options, as outlined in the blast POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def scheduleBlastFromBlast(blastId: String, scheduleTime: String, options: js.Object, callback: SailthruCallback): Unit = js.native
  def scheduleBlastFromBlast(blastId: Double, scheduleTime: String, callback: SailthruCallback): Unit = js.native
  def scheduleBlastFromBlast(blastId: Double, scheduleTime: String, options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Modify an existing campaign by copying data into it from a Template, and then scheduling it.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param template the name of a template to copy from, as the basis for this campaign
    * @param list the target list for the campaign
    * @param scheduleTime when the campaign should be sent
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def scheduleBlastFromTemplate(blastId: String, template: String, list: String, scheduleTime: String, callback: SailthruCallback): Unit = js.native
  /**
    * Modify an existing campaign by copying data into it from a Template, and then scheduling it.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param template the name of a template to copy from, as the basis for this campaign
    * @param list the target list for the campaign
    * @param scheduleTime when the campaign should be sent
    * @param options provide additional blast API options, as outlined in the blast POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def scheduleBlastFromTemplate(
    blastId: String,
    template: String,
    list: String,
    scheduleTime: String,
    options: js.Object,
    callback: SailthruCallback
  ): Unit = js.native
  def scheduleBlastFromTemplate(blastId: Double, template: String, list: String, scheduleTime: String, callback: SailthruCallback): Unit = js.native
  def scheduleBlastFromTemplate(
    blastId: Double,
    template: String,
    list: String,
    scheduleTime: String,
    options: js.Object,
    callback: SailthruCallback
  ): Unit = js.native
  /**
    * Send a single message to email, using the given template.
    * @param template Name of the template to use as the basis for the message content
    * @param email valid email address to send the message to
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def send(template: String, email: String, callback: SailthruCallback): Unit = js.native
  /**
    * Send a single message to email, using the given template.
    * @param template Name of the template to use as the basis for the message content
    * @param email valid email address to send the message to
    * @param options a Javascript object that can be used to specify any other valid API parameters for the send POST,
    * the full list is available https://getstarted.sailthru.com/new-for-developers-overview/email-and-user-profiles/send/
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def send(template: String, email: String, options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Fetch stats for any part of Sailthru.
    * @param data provide stats API options, as outlined in the stats GET documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def stats(data: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Fetch stats for a campaign send, or aggregate campaign data over a time period.
    * @param options provide stats API options, as outlined in the stats GET documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def statsBlast(options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Fetch stats for a List within Sailthru.
    * @param options provide stats API options, as outlined in the stats GET documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def statsList(options: js.Object, callback: SailthruCallback): Unit = js.native
  /**
    * Unschedule a previously scheduled campaign, by blast ID.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def unscheduleBlast(blastId: String, callback: SailthruCallback): Unit = js.native
  def unscheduleBlast(blastId: Double, callback: SailthruCallback): Unit = js.native
  /**
    * Modify an existing campaign by setting any field.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def updateBlast(blastId: String, callback: SailthruCallback): Unit = js.native
  /**
    * Modify an existing campaign by setting any field.
    * @param blastId the blast ID which was in the response of a previous blast call
    * @param options provide additional blast API options, as outlined in the blast POST documentation
    * @param callback a standard callback function which will be invoked after the API server responds
    */
  def updateBlast(blastId: String, options: js.Object, callback: SailthruCallback): Unit = js.native
  def updateBlast(blastId: Double, callback: SailthruCallback): Unit = js.native
  def updateBlast(blastId: Double, options: js.Object, callback: SailthruCallback): Unit = js.native
}

