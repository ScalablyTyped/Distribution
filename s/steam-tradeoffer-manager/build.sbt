organization := "org.scalablytyped"
name := "steam-tradeoffer-manager"
version := "2.10-dt-20230416Z-ac4d86"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bytebuffer" % "5.0.0-dt-20220818Z-c283df",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-1ebd5d",
  "org.scalablytyped" %%% "file-manager" % "2.0-dt-20220829Z-a38893",
  "org.scalablytyped" %%% "form-data" % "4.0.0-dd6625",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-e7d518",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "steam" % "0.0-unknown-dt-20230418Z-ff168e",
  "org.scalablytyped" %%% "steam-user" % "4.26-dt-20230510Z-ab861e",
  "org.scalablytyped" %%% "steamcommunity" % "3.43-dt-20220125Z-59071c",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-2ad9ef",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-1da94b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
