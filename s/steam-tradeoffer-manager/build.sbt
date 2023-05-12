organization := "org.scalablytyped"
name := "steam-tradeoffer-manager"
version := "2.10-dt-20230416Z-8114d4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bytebuffer" % "5.0.0-dt-20220818Z-81b582",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20220624Z-1ebd5d",
  "org.scalablytyped" %%% "file-manager" % "2.0-dt-20220829Z-71c6b0",
  "org.scalablytyped" %%% "form-data" % "4.0.0-305372",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "request" % "2.48-dt-20220101Z-8e1419",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "steam" % "0.0-unknown-dt-20230418Z-709cdc",
  "org.scalablytyped" %%% "steam-user" % "4.26-dt-20230510Z-bd711a",
  "org.scalablytyped" %%% "steamcommunity" % "3.43-dt-20220125Z-5e86ac",
  "org.scalablytyped" %%% "steamid" % "2.0-dt-20211202Z-2ad9ef",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20220414Z-1da94b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
